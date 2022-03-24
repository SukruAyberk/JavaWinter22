package day19_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scan.nextInt();
        int rakam = 0;
        int rakamlarToplami = 0;

        while (sayi > 0) {
            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;
        }

        System.out.println("Rakamlar Toplamı = " + rakamlarToplami);

    }
}
