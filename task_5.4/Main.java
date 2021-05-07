package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        String str="";
        ArrayList<String>list  = new ArrayList<>();
        ArrayList<Double>list1 = new ArrayList<>();
        try {
            FileInputStream fin = new FileInputStream("C:\\java\\fun.txt");
            while ((i= fin.read()) !=-1){
                if (i==13){
                    list.add(str);
                    str="";
                    continue;
                }
                str+=(char)i;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String num:list
             ) {

            double number = Double.parseDouble(num);
            if (number %2 ==0)list1.add(number) ;
           }
        Collections.sort(list1);
        System.out.println(list1);
        }


    }



