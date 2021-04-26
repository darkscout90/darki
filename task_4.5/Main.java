package com.company;

public class Main {

    public static void main(String[] args) {
        Horse kapa= new Horse();
        kapa.run();
        Pegasus kepa=new Pegasus();
        kepa.fly();
    }
 abstract static class Animal{
        String name;
 }
 static class Horse extends Animal{
      public void run(){
          System.out.println("Игого,я поскакал");
        }
 }
 static class Pegasus extends Animal{
        public void fly(){
            System.out.println("Игого,я полетел");
        }
 }
    }

