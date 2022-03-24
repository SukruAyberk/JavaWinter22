package day05_matematikselIslemler;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 5 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int rakam = 0;
        int toplam = 0;

        rakam = sayi%10;
        toplam += rakam;
        sayi/=10;

        rakam = sayi%10;
        toplam += rakam;
        sayi/=10;

        rakam = sayi%10;
        toplam += rakam;
        sayi/=10;

        rakam = sayi%10;
        toplam += rakam;
        sayi/=10;

        rakam = sayi%10;
        toplam += rakam;
        sayi/=10;

        rakam = sayi%10;
        toplam += rakam;
        sayi/=10;

        System.out.println(sayi);
        System.out.println(toplam);

    }
}
