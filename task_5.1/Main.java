package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        for (int i = 0; i <names.size() ; i++) {
            for (int j = 0; j <names.size() ; j++) {
                if (names.get(i) == names.get(j) && i !=j){
                    names.remove(j);

                }
            }
        }
        System.out.println(names);
    }
}

