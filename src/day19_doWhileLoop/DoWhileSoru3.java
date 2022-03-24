package day19_doWhileLoop;

import java.util.Scanner;

public class DoWhileSoru3 {

    public static void main(String[] args) {

        // Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        do {
            System.out.println("Lütfem bir sayi girin:\nİşlemi bitirmek için sıfıra bas:");
            sayi = scan.nextInt();
            toplam += sayi;
        } while (sayi != 0);

        System.out.println("Toplam = " + toplam);
    }
}
