package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Volf volf = new Volf(2, 3, "white");
        System.out.println(volf.getId());
        System.out.println(volf.getAge());
        System.out.println(volf.getColor());
        volf.hunt();

        Lion lion = new Lion(23, 5, "red");
        System.out.println("\n"+lion.getId());
        System.out.println(lion.getAge());
        System.out.println(lion.getColor());

        lion.hunt();

        Bear bear = new Bear(34, 6, "Black");
        System.out.println(bear.getId());
        System.out.println(bear.getAge());
        System.out.println(bear.getColor());

        bear.hunt();
    }
}
