package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        // kullanıcıdan bir kelime isteyin
        // eğer kelime 3 harften kısaysa "kelime çok kısa" yazdırın
        // eğer kelime 3, 4 veya 5 harfli ise harf sayısını ve kelimenin tersten yazılışını yazdırın
        // eğer 5 harften uzunsa "kelime çok uzun" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime girin: ");
        String kelime = scan.nextLine();
        String tersKelime = "";

        if (kelime.length() < 3) {
            System.out.println("Kelime cok kisa");
        } else if (kelime.length() <= 5) {
            System.out.println("Kelimenin harf sayisi = " + kelime.length());
            if (kelime.length() == 3) {
                tersKelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);
                System.out.println("Kelimenin tersten yazılışı = " + tersKelime);
            } else if (kelime.length() == 4) {
                tersKelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
                ;
                System.out.println("Kelimenin tersten yazılışı = " + tersKelime);
            } else {
                tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
                System.out.println("Kelimenin tersten yazılışı = " + tersKelime);
            }

        } else {
            System.out.println("Kelime cok uzun");
        }

    }

}
