package day03_scanner;

public class C02_SwapVariables {

    public static void main(String[] args) {

        // templi swap
        int sayi1 = 10, sayi2 = 20, temp;
        System.out.println("sayı1: " + sayi1 + " sayi2: " + sayi2 );
        temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;
        System.out.println("swaplı sayı1: " + sayi1 + " swaplı sayi2: " + sayi2 );

    }
}
