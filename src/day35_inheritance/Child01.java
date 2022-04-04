package day35_inheritance;

public class Child01 extends Parent {

    public static void main(String[] args) {

        /*
        Child class objeye ihtiyaç olmadan parent classdaki
        variable ve methodlara ulaşabilir
         */

        System.out.println(isim);
        System.out.println(fabrika);
        method1();
        method2();

    }

}
