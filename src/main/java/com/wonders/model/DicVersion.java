package com.wonders.model;

import java.util.Date;

public class DicVersion {
    private String id;

    private String dicCode;

    private String verCode;

    private String verName;

    private String verDesc;

    private String createId;

    private Date createTime;

    private String tabNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode == null ? null : dicCode.trim();
    }

    public String getVerCode() {
        return verCode;
    }

    public void setVerCode(String verCode) {
        this.verCode = verCode == null ? null : verCode.trim();
    }

    public String getVerName() {
        return verName;
    }

    public void setVerName(String verName) {
        this.verName = verName == null ? null : verName.trim();
    }

    public String getVerDesc() {
        return verDesc;
    }

    public void setVerDesc(String verDesc) {
        this.verDesc = verDesc == null ? null : verDesc.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTabNum() {
        return tabNum;
    }

    public void setTabNum(String tabNum) {
        this.tabNum = tabNum == null ? null : tabNum.trim();
    }
}