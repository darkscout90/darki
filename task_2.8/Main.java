package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int[] arr = {2,3,4,5};
     int a=0;
        for (int i = 0; i <arr.length ; i++) {
          if (i==0){
              a = arr[i];
          } else {
              a = a * arr[i];
          }
        }
        System.out.println(a);
    }
}
