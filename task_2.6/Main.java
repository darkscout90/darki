package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a % b;
        if (c==0){
            System.out.println("Делится."+"Ответ:"+a/b);
        }else {
            System.out.println("Не делится.Остаток:"+c);
        }
    }
}
