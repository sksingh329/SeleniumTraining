package com.subodh.javatraining.classExamples.objects;

class Test{
    int a,b;
    Test(){
        a = b = 0;
    }
}
public class ClassAsReference {
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.a = 10;
        test1.b = 20;
        System.out.println("Value of a and b are: "+test1.a+","+test1.b);
        Test test2 = test1;
        test2.a = 40;
        test2.b = 50;
        System.out.println("Value of a and b are: "+test1.a+","+test1.b);
        System.out.println(test2.equals(test1));
    }
}
