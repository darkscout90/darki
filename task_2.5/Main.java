package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a==10){
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
    }
}
