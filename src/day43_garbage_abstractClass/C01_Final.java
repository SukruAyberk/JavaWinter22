package day43_garbage_abstractClass;

public class C01_Final {

    final static double piSayisi = 3.14159265;
    final static String okulIsmi = "Yildiz Koleji";

    public static void main(String[] args) {

        // final variable değiştirilemez
        final int sayi = 10;
    }

    public static final void method1() {
        System.out.println("Parent class final method1");
    }
}
