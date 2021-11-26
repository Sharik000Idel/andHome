package com.example.idelproject_list.moduls;

import android.graphics.Color;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

    private String name_tovar;
    private double price;
    private List<String> color_tovar;
    private List<String> size_tovar;
    private int image_tovar;


    public Product(String name_tovar,double price, List<String> color_tovar, List<String> size_tovar, int image_tovar ,String description) {
        this.price = price;
        this.name_tovar = name_tovar;
        this.color_tovar = color_tovar;
        this.size_tovar = size_tovar;
        this.image_tovar = image_tovar;
        this.description = description;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private String description;

    public String getName_tovar() {
        return name_tovar;
    }

    public void setName_tovar(String name_tovar) {
        this.name_tovar = name_tovar;
    }

    public List<String> getColor_tovar() {
        return color_tovar;
    }

    public void setColor_tovar(List<String> color_tovar) {
        this.color_tovar = color_tovar;
    }

    public List<String> getSize_tovar() {
        return size_tovar;
    }

    public void setSize_tovar(List<String> size_tovar) {
        this.size_tovar = size_tovar;
    }

    public int getImage_tovar() {
        return image_tovar;
    }

    public void setImage_tovar(int image_tovar) {
        this.image_tovar = image_tovar;
    }

}
