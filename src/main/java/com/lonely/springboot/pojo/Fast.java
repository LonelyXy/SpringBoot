package com.lonely.springboot.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xyLonely
 * @date 2019/3/20 9:25
 */
public class Fast implements Serializable{

    private String name;

    private String sex;

    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
