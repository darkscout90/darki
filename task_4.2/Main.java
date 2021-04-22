package com.company;

public class Main {

    public static void main(String[] args) {
    Dog tusic= new Dog();
    tusic.setName("Тузик");
    tusic.getName();
    tusic.setage(11);
    tusic.getage();
    }
    static class Dog {
         String name ;
         int age;

        public void setName(String name) {
            this.name=name;

        }
        public void setage(int age) {
            this.age=age;

        }

        public void getName(){
            System.out.println(this.name);
        }
        public void getage(){
            System.out.println(this.age);
        }
    }

}
