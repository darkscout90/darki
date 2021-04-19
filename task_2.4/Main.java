package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vvedite vklad");
        double a = scan.nextInt();
        System.out.println("vvedite %");
        double b = scan.nextInt();
        for (int i = 0; i <5 ; i++) {
            a = a+a*(b/100);
            System.out.println(Math.round(a));
        }
    }
}
