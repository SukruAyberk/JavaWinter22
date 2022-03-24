package day19_doWhileLoop;

import java.util.Scanner;

public class Soru7 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi: ");
        int sayi = scan.nextInt();

        sayiToplayanMethod(sayi);

    }

    private static void sayiToplayanMethod(int sayi) {

        int rakam = 0;
        int toplam = 0;

        while (sayi > 0) {
            rakam = sayi % 10;
            toplam += rakam;
            sayi /= 10;
        }
        System.out.println(toplam);

    }
}
