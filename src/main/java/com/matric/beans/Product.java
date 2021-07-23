package com.matric.beans;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product {

    private Integer id;
    private String name;
    private double width;
    private double length;
    private String color;
    private int rating;
    private Double cost;
    private Date mfDate;
    private Date expDate;
    private String mfLocation;
    private String mfCompany;
}
