package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int a= 31;
     int b;
     boolean bool1=false;
        for (int i = 2; i <31 ; i++) {
           b= a % i;
           if (b==0){
               bool1 = true;
           }
        }
        System.out.println(bool1);
    }
}
