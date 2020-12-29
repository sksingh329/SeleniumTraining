package com.subodh.javatraining.oop.classExamples;

class Box{
    int height; //instance variable
    int depth;
    int width; //u000

    Box(int height, int depth, int width){
       this.height = height;
        this.depth = depth;
        this.width = width;
    }
    Box(int value){
        height = width = depth = value;
    }
    Box(){
        height = width = depth = 1;
    }
    int volume(){
        return height*depth*width;
    }

}
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(10,20,30);
        System.out.println(myBox.height);
        myBox.volume();
       // Box myBox2 = myBox;
        // System.out.println("Volume =" + myBox.volume());
        //myBox = null;
        //System.out.println("Volume =" + myBox2.volume());
    }
}
