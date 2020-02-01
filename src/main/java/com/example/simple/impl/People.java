package com.example.simple.impl;

import com.example.simple.SeasonEnum;
import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

@Serialization
public class People implements com.example.simple.People {
    // alt + insert
    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer Age;
    public String Name;

    public SeasonEnum getSeason() {
        return season;
    }

    public void setSeason(SeasonEnum season) {
        this.season = season;
    }

    public SeasonEnum season;

    @Override // ctrl + I
    public void eat() {
        System.out.println("People eat!");
    }
}
