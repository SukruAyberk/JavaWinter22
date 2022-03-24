package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        // kullanıcıdan aldığınız 4 basamaklı bir sayının basamaklardaki rakamlar toplamı?
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int rakam = 0, toplam = 0;

        // 1. adım rakam = 0, sayı = 7532(örnek)
        rakam = sayi%10; // 753
        toplam += rakam; // 2
        System.out.println(toplam); // 2
        sayi /= 10; // 753
        System.out.println(sayi); // 753

        // 2. adım rakam = 2, toplam =2, sayı = 753
        rakam = sayi%10; // 3
        toplam += rakam; // 5
        System.out.println(toplam); //5
        sayi/=10; // 75
        System.out.println(sayi); //75

        // 3. adım rakam =3, toplam = 5, sayı 75
        rakam = sayi%10; // 7
        toplam += rakam; // 10
        System.out.println(toplam); // 10
        sayi/=10; // 7
        System.out.println(sayi); // 7

        // 4. adım rakam = 7, toplam = 10, sayı = 7
        rakam = sayi%10; // 0
        toplam += rakam; // 17
        System.out.println(toplam);
        sayi/=10; //0
        System.out.println(sayi);




    }
}
