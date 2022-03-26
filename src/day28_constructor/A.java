package day28_constructor;

public class A {

    String name;
    String surName;
    int age;
    int ID;

    public A() {
        System.out.println("İlk olarak parametresizi yazdırdı.");
    }

    public A(String name, String surName) {
        this();
        this.name = name;
        this.surName = surName;
    }

    public A(String name, String surName, int age, int ID) {
        this(name, surName);

        this.name = name;
        this.surName = surName;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", ID=" + ID;
    }


}
