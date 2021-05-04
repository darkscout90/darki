package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(2);
    numbers.add(5);
    numbers.add(23);
    numbers.add(0);
    numbers.add(-3);
    List<Integer> newNum = new ArrayList<Integer>();
        for (int num:numbers
             ) {
            if (num>0 && num<10){
                newNum.add(num);
            }
        }
        System.out.println(newNum);
    }
}

