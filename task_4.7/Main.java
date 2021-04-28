package com.company;

public class Main {
    public static void main(String[] args) {
    Fox fox = new Fox();
    System.out.println(fox.getColor());
    }
}


interface Animal {
    String getColor();
}

class Fox implements Animal {
    public String getName() {
        return "Fox";
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
