package com.subodh.javatraining.oop.inheritanceExamples;

public class Box {
    private double height, width, depth;
    Box(){

    }
    Box(int height,int width,int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double getHeight(){
        return height;
    }
    public double volume(){
        return height*width*depth;
    }
}
