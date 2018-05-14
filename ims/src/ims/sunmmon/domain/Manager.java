﻿package ims.sunmmon.domain;

import java.io.Serializable;

// 담당자 
public class Manager implements Serializable {

    // 번호 
    private Integer managerNo;

    // 담당자명 
    private String managerName;

    // 부서명 
    private String depName;

    // 전화(집) 
    private String telephone;

    // 휴대전화 
    private Integer cellphone;

    // 이메일 
    private String email;

    // 팩스 
    private Integer fax;

    // 사용(조회)가능여부 
    private Integer useable;

    // 비고 
    private String note;

    public Integer getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(Integer managerNo) {
        this.managerNo = managerNo;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getCellphone() {
        return cellphone;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFax() {
        return fax;
    }

    public void setFax(Integer fax) {
        this.fax = fax;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Manager 모델 복사
    public void CopyData(Manager param)
    {
        this.managerNo = param.getManagerNo();
        this.managerName = param.getManagerName();
        this.depName = param.getDepName();
        this.telephone = param.getTelephone();
        this.cellphone = param.getCellphone();
        this.email = param.getEmail();
        this.fax = param.getFax();
        this.useable = param.getUseable();
        this.note = param.getNote();
    }
}