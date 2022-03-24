package day19_doWhileLoop;

import java.util.Scanner;

public class Soru4 {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        // harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        // yapmadigini farz edin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç harfi: ");
        char baslangic = scan.next().toUpperCase().charAt(0);

        System.out.println("Başlangıç harfi: ");
        char bitis = scan.next().toUpperCase().charAt(0);

        for (char i = baslangic; i <= bitis; i++) {
            System.out.print(i + " ");

        }

        System.out.println();

        while (baslangic <= bitis) {
            System.out.print(baslangic + " ");
            baslangic++;
        }


    }
}
