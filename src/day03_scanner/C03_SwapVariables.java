package day03_scanner;

public class C03_SwapVariables {

    public static void main(String[] args) {

       // tempsiz swap
        int sayi1 = 10, sayi2 = 20;
        System.out.println("sayı 1: " + sayi1 + " sayi2; " + sayi2);
        sayi1 = sayi1 + sayi2; // 30
        sayi2 = sayi1 - sayi2; // 10
        sayi1 = sayi1 - sayi2;
        System.out.println("swaplı sayı 1: " + sayi1 + " swaplı sayi2; " + sayi2);



    }
}
