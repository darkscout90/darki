package com.company;

public class Main {

    public static void main(String[] args) {
    int a=4;
    int b=4;
        System.out.println(fun1(a,b));
    }
    static boolean fun1(int a,int b){
        boolean flag=false;
        int c=a+b;
        if (c>10)flag = true;
        return flag;
    }

}
