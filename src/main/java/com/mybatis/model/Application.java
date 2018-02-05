package com.mybatis.model;

import java.util.Date;

public class Application {
    private Integer id;

    private String code;

    private String name;

    private String remark;

    private Date updateTime;

    private Date createTime;

    private Boolean deleted;

    public Application(Integer id, String code, String name, String remark, Date updateTime, Date createTime, Boolean deleted) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.remark = remark;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.deleted = deleted;
    }

    public Application() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}