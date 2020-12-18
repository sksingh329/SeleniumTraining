package com.subodh.javatraining.classExamples.objects;

class Rectangle {
    int height, width;
    Rectangle(){

    }
    Rectangle(int height){
        this.height = height;
    }
    void display(){
        System.out.println("I am inside display method");
        System.out.println("Value of height is "+height);
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        new Rectangle().height = 10;
        int height = new Rectangle().height;
        System.out.println(height);
    }
}
