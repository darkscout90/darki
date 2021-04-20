package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int[] arr = {2,3,4,5};
     boolean bool1=false;
        for (int i = 0; i <arr.length ; i++) {
         if (arr[i]==5){
             System.out.println("да");
             bool1 = true;
         }
        }
        if (bool1 == false){
            System.out.println("нет");
        }
    }
}
