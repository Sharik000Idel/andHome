package com.example.listsproject.Models;

import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private String capital;
    private int flag;
    private int count;
    private String description;

    public Country(String name, String capital, int flag, int count, String description) {
        this.name = name;
        this.capital = capital;
        this.flag = flag;
        this.count = count;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
