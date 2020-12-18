package com.subodh.javatraining.classExamples.objects;

class CompareObjects {
    int a,b;
    CompareObjects(int i, int j){
        a = i;
        b = j;
    }
    boolean equalTo(CompareObjects anotherObject){
        if(a == anotherObject.a && b == anotherObject.b)
            return true;
        else
            return false;
    }
    void display(){
        System.out.println("a= "+a+" ,b= "+b);
    }
}
public class CompareObjectsTest{
    public static void main(String[] args) {
        CompareObjects a = new CompareObjects(10,20);
        CompareObjects b = new CompareObjects(10,20);
        CompareObjects c = new CompareObjects(10,5);
        new CompareObjects(100,200).display();
        System.out.println(a.equalTo(b));
        System.out.println(a.equalTo(c));
    }
}
