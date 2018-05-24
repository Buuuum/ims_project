package ims.sunmoon.service.ww;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.WW;
import ims.sunmoon.persistance.WWMapper;

@Service
public class WWServiceImpl implements WWService {
	@Resource
	private WWMapper wwMapper;

	@Override
	public List<WW> list(WW ww) {
		ww.setUseable(1);
		return this.wwMapper.list(ww);
	}

	@Override
	public List<WW> list(Date first, Date last) {
		WW find = new WW();
		find.setUseable(1);
		find.setFirst(first);
		find.setLast(last);
		return this.list(find);
	}

	@Override
	public List<WW> list(WW ww, String keyword) {
		// TODO: 검색옵션에 따라 로직 구현
		List<WW> find = null;
		ww.setUseable(1);
		ww.setKeyword(keyword);
		if (ww.getFindOption() != null) {
			switch (ww.getFindOption()) {
			case ITEM_CODE:
			case ITEM_NAME:
				find = this.wwMapper.findItem(ww);
				break;

			case CLIENT_NAME:
				find = this.wwMapper.findClient(ww);
				break;

			case CON_VER:
				ww.setConVer(keyword);
				find = this.list(ww);
				break;
			}
		}
		return find;
	}

	@Override
	@Transactional
	public void add(WW ww) {
		this.wwMapper.insert(ww);
	}

	@Override
	public WW view(WW ww) {
		return this.wwMapper.select(ww);
	}

	@Override
	@Transactional
	public void edit(WW ww) {
		this.wwMapper.update(ww);
	}

	@Override
	@Transactional
	public void remove(String wwNo) {
		this.wwMapper.delete(wwNo);
	}
}
