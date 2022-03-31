package com.company;

public class Bear extends Predator implements Huntable {

    public Bear(int id, int age, String color) {
        super(id, age, color);
    }

    @Override
    public void hunt() {
        System.out.println("Bear can to hunt");
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}

