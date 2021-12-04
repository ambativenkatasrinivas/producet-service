package com.matric.beans;

import lombok.ToString;

//import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@ToString
//@Entity
//@Table
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double width;
    private double length;
    private String color;
    private int rating;
    private Double cost;
//    @Column(name = "mf_date")
    private Date mfDate;
//    @Column(name = "exp_date")
    private Date expDate;
//    @Column(name = "mf_location")
    private String mfLocation;
//    @Column(name = "mf_company")
    private String mfCompany;

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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Date getMfDate() {
        return mfDate;
    }

    public void setMfDate(Date mfDate) {
        this.mfDate = mfDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getMfLocation() {
        return mfLocation;
    }

    public void setMfLocation(String mfLocation) {
        this.mfLocation = mfLocation;
    }

    public String getMfCompany() {
        return mfCompany;
    }

    public void setMfCompany(String mfCompany) {
        this.mfCompany = mfCompany;
    }
}
