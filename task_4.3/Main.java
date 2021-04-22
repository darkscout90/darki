package com.company;

public class Main {

    public static void main(String[] args) {
     Cat Rusic = new Cat();
     Cat Barsic = new Cat();
    Rusic.name="Рыжик";
    Barsic.name="Барсик";
     Rusic.weight=5;
     Rusic.power=10;
     Rusic.age=9;
     Barsic.age=1;
     Barsic.power=7;
     Barsic.weight=9;
        System.out.println(Rusic.fight(Rusic,Barsic));
    }
    static class Cat {
         String name ;
         int age;
         int power;
         int weight;

         boolean fight(Cat a,Cat b){
          int i=0,j=0;
          if (a.age>b.age)i++;
          else j++;
          if (a.power>b.power)i++;
          else j++;
          if (a.weight>b.weight)i++;
          else j++;
          if (i>j){
              System.out.println(a.name+ " Победил");
              return true;
            }
          else if (i==j){
              System.out.println("Ничья");
              return true;

          }
          else {
              System.out.println(b.name +" Победил");
              return false;
          }
         }


    }

}
