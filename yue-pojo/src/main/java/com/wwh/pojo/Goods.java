package com.wwh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 西瓜都不酸 on 2019/10/28.
 */
public class Goods implements Serializable{

    private long id;
    private String gname;
    private Date dated;
    private String img;
    private double price;

    public long getId() {
        return id;
    }

    public Goods setId(long id) {
        this.id = id;
        return this;
    }

    public String getGname() {
        return gname;
    }

    public Goods setGname(String gname) {
        this.gname = gname;
        return this;
    }

    public Date getDated() {
        return dated;
    }

    public Goods setDated(Date dated) {
        this.dated = dated;
        return this;
    }

    public String getImg() {
        return img;
    }

    public Goods setImg(String img) {
        this.img = img;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Goods setPrice(double price) {
        this.price = price;
        return this;
    }
}
