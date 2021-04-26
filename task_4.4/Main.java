package com.company;

public class Main {

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat Tom = new Cat("Tom",50,15);
        Dog Spike = new Dog("Spike",100,6);
    }

    static class Cat {
        String name;
        int height;
        int tail;
        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }
    static class Dog {
        String name;
        int height;
        int tail;
        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }
    static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
