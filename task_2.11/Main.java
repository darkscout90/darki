package com.company;

public class Main {

    public static void main(String[] args) {
	int arr[] = {1,4,6,8,2,1,2,4};
    int a=0;
    int b=0;
        for (int i = 0; i <arr.length ; i++) {
          a =a+arr[i];
          b++;
          if (a>10){
              break;
          }
        }
     System.out.println(b);
    }
}
