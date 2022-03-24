package day19_doWhileLoop;

import java.util.Scanner;

public class Soru5 {

    public static void main(String[] args) {

        // Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
        // yazdirin. Kullanicinin hata yapmadigini farz edin.
        // Ornegin kullanici 3 girerse;
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi: ");
        int sayi = scan.nextInt();
        int carpan = 1;
        int carpim = 0;

        while (carpan <= 10) {
            carpim = sayi * carpan;
            System.out.println(sayi + " * " + carpan + " = " + carpim);
            carpan++;
        }

    }
}
