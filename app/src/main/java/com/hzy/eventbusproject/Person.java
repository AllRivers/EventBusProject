package com.hzy.eventbusproject;


public  class Person {
    private String name;
    private int sex;
    private int age;

    public Person(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}