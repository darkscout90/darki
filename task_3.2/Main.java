package com.company;

public class Main {

    public static void main(String[] args) {
    int a=4;
    int b=23;
    int c=24;
    int d=3;
        System.out.println(fun1(a,b,c,d));
    }

    static int fun1(int a,int b){
       if (a<b)return a;
       else return b;

    }
    static int fun1(int a,int b,int c,int d){
        return fun1(fun1(a,b),fun1(c,d));
    }
}
