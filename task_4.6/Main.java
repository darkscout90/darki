package com.company;

public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим",58,null,null);
        Person vadim = new Person("Вадим",58,null,null);
        Person klava = new Person("Клава",57,null,null);
        Person nina = new Person("Нина", 60, null,null);
        Person oleg = new Person("Олег",40,klava,maxim);
        Person olga = new Person("Ольга",35,nina,vadim);
        Person igor = new Person("Игорь",13,olga,oleg);
        Person gosha = new Person("Гоша",12,olga,oleg);
        gosha.getInfo();

    }
}

class Person{
    private String name;
    private int age;
    private Person mother;
    private Person father;

    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }
    public void getInfo(){
        String info= "Меня зовут "+this.name+"\n";
        if(this.mother != null){
            info += "Имя моей мамы: "+this.mother.name+"\n"; // info = info + "Мою маму...";
            info += "Имя моего папы:"+this.father.name+"\n";
            if (this.mother.mother != null && this.father.mother !=null){
                info += "У меня 2 бабушки, бабушка "+this.mother.mother.name+" и бабушка "+this.father.mother.name+"\n";
            }
            if (this.mother.father != null && this.father.father !=null){
                info += "У меня 2 дедушки, дед "+this.mother.father.name+" и дед "+this.father.father.name+"\n";
            }

        }
        System.out.println(info);
}
}