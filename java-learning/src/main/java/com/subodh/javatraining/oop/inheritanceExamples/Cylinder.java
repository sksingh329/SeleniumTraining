package com.subodh.javatraining.oop.inheritanceExamples;

public class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
