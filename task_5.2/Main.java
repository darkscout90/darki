package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        System.out.println("ВВедите семьи и города");
        while (true) {
            String family = scanner.nextLine();
            String city = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
            cities.add(city);
        }
        System.out.println("Выберите город");
        // Read the house number
        String chosencity = scanner.nextLine();
        boolean flag=false;
        for (String city:cities
             ) {
            if (city.equals(chosencity)){

               flag = true;
                System.out.println(list.get( cities.indexOf(city)));
            }
        }
        if (flag == false) System.out.println("В этом городе нет семей");

        System.out.println(cities);
    }
}

