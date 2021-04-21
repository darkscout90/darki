package com.company;

public class Main {

    public static void main(String[] args) {
    int[] arr={1,2,3};
        System.out.println(fun1(arr));
        System.out.println(fun1(arr));
        System.out.println(fun1(arr));
        System.out.println(fun1(arr));
    }

    static int fun1(int[] arr){
      int b=0;
        for (int i = 0; i <arr.length ; i++) {

            if (i==0)b=arr[i];
            if (i==arr.length-1)break;
            if (arr[i]<b)b=arr[i];
        }
        return b;
    }
}
