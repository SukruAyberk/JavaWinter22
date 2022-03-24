package day19_doWhileLoop;

import java.util.Scanner;

public class DoWhileSoru4 {

    public static void main(String[] args) {

        // Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini
        // soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi
        // giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi
        // girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int negatifSayilar = 0;
        int pozitifSayilar = 0;

        do {
            System.out.println("Sayı gir: \nBitirmek için sıfıra bas: ");
            sayi = scan.nextInt();

            if (sayi < 0) {
                System.out.println("Negatif sayı giremezsiniz!");
                negatifSayilar++;
            } else if (sayi > 0){
                toplam += sayi;
                pozitifSayilar++;
            }
        } while (sayi != 0);

        System.out.println("Girilen pozitif sayı toplamı: " + pozitifSayilar);
        System.out.println("Girilen negatif sayı toplamı: " + negatifSayilar);
        System.out.println("Toplam = " + toplam);

    }
}
