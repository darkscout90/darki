package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={2,3,1,53,32,21};
        fun1(arr,arr.length);
    }
    static int fun1(int[] arr,int i){

       if(i >0) {
           System.out.println(arr[i-1]);
            return fun1(arr,i-1);}
        else return arr[i];



    }


}
