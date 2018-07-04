package com.dyy.mybatis.entity;

import java.util.Date;

//实体类-》数据库
public class MemoGroup {

    private Integer id;
    private String name;
    private Date creatTime;
    private Date modifTime;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreatTime() {
        return creatTime;
    }
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
    public Date getModifTime() {
        return modifTime;
    }
    public void setModifTime(Date modifTime) {
        this.modifTime = modifTime;
    }
    @Override
    public String toString() {
        return "MemoGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creatTime=" + creatTime +
                ", modifTime=" + modifTime +
                '}';
    }
}
