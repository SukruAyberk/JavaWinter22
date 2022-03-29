package day28_constructor;

public class A {

    String name;
    String surName;
    int age;
    int ID;

    public A() {

    }

    public A(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public A(String name, String surName, int age, int ID) {
        this("aysdgk","alfgkjf");
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age;
    }
}
