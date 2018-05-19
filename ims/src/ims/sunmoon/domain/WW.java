﻿package ims.sunmoon.domain;

import java.io.Serializable;
import java.sql.Date;

import ims.sunmoon.util.option.sort.WWSortOption;

// 입고/출금 
public class WW implements Serializable {
	private static final long serialVersionUID = 6034568100243562754L;

	// 번호
	private Integer wwNo;

	// 입고번호
	private Integer wareNo;

	// 출금번호
	private Integer withNo;

	// 거래완료일
	private Date wwDate;

	// 매입수량
	private Integer quantity;

	// 금액합계
	private Integer ammount;

	// 사용(조회)가능여부
	private Integer useable;

	// 적요
	private String conVer;

	// 비고
	private String note;

	private WWSortOption wwSortOption;
	private Date first;
	private Date last;

	public Integer getWwNo() {
		return wwNo;
	}

	public void setWwNo(Integer wwNo) {
		this.wwNo = wwNo;
	}

	public Integer getWareNo() {
		return wareNo;
	}

	public void setWareNo(Integer wareNo) {
		this.wareNo = wareNo;
	}

	public Integer getWithNo() {
		return withNo;
	}

	public void setWithNo(Integer withNo) {
		this.withNo = withNo;
	}

	public Date getWwDate() {
		return wwDate;
	}

	public void setWwDate(Date wwDate) {
		this.wwDate = wwDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAmmount() {
		return ammount;
	}

	public void setAmmount(Integer ammount) {
		this.ammount = ammount;
	}

	public Integer getUseable() {
		return useable;
	}

	public void setUseable(Integer useable) {
		this.useable = useable;
	}

	public String getConVer() {
		return conVer;
	}

	public void setConVer(String conVer) {
		this.conVer = conVer;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public WWSortOption getWwSortOption() {
		return wwSortOption;
	}

	public void setWwSortOption(WWSortOption wwSortOption) {
		this.wwSortOption = wwSortOption;
	}

	public Date getFirst() {
		return first;
	}

	public void setFirst(Date first) {
		this.first = first;
	}

	public Date getLast() {
		return last;
	}

	public void setLast(Date last) {
		this.last = last;
	}

	// Ww 모델 복사
	public void CopyData(WW param) {
		this.wwNo = param.getWwNo();
		this.wareNo = param.getWareNo();
		this.withNo = param.getWithNo();
		this.wwDate = param.getWwDate();
		this.quantity = param.getQuantity();
		this.ammount = param.getAmmount();
		this.useable = param.getUseable();
		this.conVer = param.getConVer();
		this.note = param.getNote();
		this.wwSortOption = param.getWwSortOption();
		this.first = param.getFirst();
		this.last = param.getLast();
	}
}