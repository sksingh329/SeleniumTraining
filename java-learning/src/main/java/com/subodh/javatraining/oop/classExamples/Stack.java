package com.subodh.javatraining.oop.classExamples;

public class Stack {
    private int[] items = new int[10];
    private int top;

    public Stack(){
        top = -1;
    }
    public void push(int val){
        if(top == 9)
            System.out.println("Stack is full");
        else
            items[++top] = val;
    }
    public int pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return items[top--];
    }
    public int peek(){
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return items[top];
    }
}
