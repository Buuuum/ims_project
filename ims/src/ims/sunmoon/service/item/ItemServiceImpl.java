package ims.sunmoon.service.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ims.sunmoon.domain.Item;
import ims.sunmoon.persistance.ItemMapper;

@Service
public class ItemServiceImpl implements ItemService {
	@Resource
	private ItemMapper itemMapper;

	@Override
	public List<Item> list(Item item) {
		item.setUseable(1);
		return this.itemMapper.list(item);
	}

	@Override
	@Transactional
	public void add(Item item) {
		this.itemMapper.insert(item);
	}

	@Override
	public Item view(Item item) {
		return this.itemMapper.select(item);
	}

	@Override
	public Item view(String itemCode) {
		Item find = new Item();
		find.setItemCode(itemCode);
		return this.itemMapper.select(find);
	}

	@Override
	@Transactional
	public void edit(Item item) {
		this.itemMapper.update(item);
	}

	@Override
	@Transactional
	public void remove(String itemNo) {
		this.itemMapper.delete(itemNo);
	}
}
