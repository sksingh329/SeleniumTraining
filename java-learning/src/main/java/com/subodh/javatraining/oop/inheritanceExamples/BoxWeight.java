package com.subodh.javatraining.oop.inheritanceExamples;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(int height, int width, int depth, int weight){
        super(height,width,depth);
        this.weight = weight;
    }
}
