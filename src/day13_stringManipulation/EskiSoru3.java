package day13_stringManipulation;

import java.util.Scanner;

public class EskiSoru3 {

    public static void main(String[] args) {

        Scanner scane = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String name = scane.nextLine();

        if (name.contains("a")) {
            System.out.println("Gİrdiğiniz isim a harfi içeriyor.");
        } else if (name.contains("Z")) {
            System.out.println("Girdiğiniz isim Z harfi içeriyor.");
        } else {
            System.out.println("Girdiğiniz isim a ve Z harfi içermiyor.");
        }

    }
}
