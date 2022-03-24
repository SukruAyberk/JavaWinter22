package day19_doWhileLoop;

import java.util.Scanner;

public class DoWhileSoru5 {

    public static void main(String[] args) {

        // Soru 5 )
        // Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
        // edin ve sifredeki hatalari yazdirin.
        // Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        // girdiginde “Sifreniz Kabul edilmistir” yazdirin.

        //-Sifre kucuk harf icermelidir
        //-Sifre buyuk harf icermelidir
        //-Sifre ozel karakter icermelidir
        //-Sifre en az 8 karakter olmalidir.

        Scanner scan = new Scanner(System.in);
        String sifre = "";

        boolean kucukHarf = false;
        boolean buyukHarf = false;
        boolean karakter = false;
        boolean uzunluk = false;


        do {
            System.out.print("Lutfen bir sifre girin: ");
            sifre = scan.nextLine();

            kucukHarf = kucukHarfKontrolEt(sifre);
            buyukHarf = buyukHarfKontrolEt(sifre);
            karakter = karakterKontrolEt(sifre);
            uzunluk = uzunlukKontrolEt(sifre);

        } while (!kucukHarf || !buyukHarf || !karakter || !uzunluk);

        System.out.println("Şifreniz kaydedildi.");

    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunluk = false;
        if (sifre.length() >= 8) {
            uzunluk = true;
        } else {
            System.out.println("sifreniz 8 karakterden az olamaz");
        }
        return uzunluk;
    }

    private static boolean karakterKontrolEt(String sifre) {
        boolean karakter = false;
        String karakterDeposu = ",.;:-?=) (/&%+^'!><$½#@>][";
        for (int i = 0; i < sifre.length(); i++) {
            if (karakterDeposu.contains(sifre.substring(i, i + 1))) {
                karakter = true;
                break;
            }
        }
        if (!karakter) {
            System.out.println("girdiginiz sifre en az bir özel karakter içermelidir");
        }
        return karakter;
    }

    private static boolean buyukHarfKontrolEt(String sifre) {
        boolean buyukHarf = false;
        String buyukHarfDeposu = "ABCDEFGHIJKLMNOPRSTQWUXVYZ";
        for (int i = 0; i < sifre.length(); i++) {
            if (buyukHarfDeposu.contains(sifre.substring(i, i + 1))) {
                buyukHarf = true;
                break;
            }
        }
        if (!buyukHarf) {
            System.out.println("girdiginiz sifre en az bir buyuk harf içermelidir");
        }
        return buyukHarf;
    }

    private static boolean kucukHarfKontrolEt(String sifre) {
        boolean kucukHarf = false;
        String kucukHarfDeposu = "abcdefghijklmnoprstqwuxyz";
        for (int i = 0; i < sifre.length(); i++) {
            if (kucukHarfDeposu.contains(sifre.substring(i, i + 1))) {
                kucukHarf = true;
                break;
            }
        }
        if (!kucukHarf) {
            System.out.println("girdiginiz sifre en az bir kucuk harf içermelidir");
        }
        return kucukHarf;
    }
}
