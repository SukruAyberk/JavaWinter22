package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

        // kullanıcıdan bir kelime isteyin
        // eğer kelime 3 harften kısaysa "kelime çok kısa" yazdırın
        // eğer kelime 3, 4 veya 5 harfli ise harf sayısını ve kelimenin tersten yazılışını yazdırın
        // eğer 5 harften uzunsa "kelime çok uzun" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime girin: ");
        String kelime = scan.nextLine();
        int harfSayisi = kelime.length();

        if (harfSayisi < 3) {
            System.out.println("Kelime cok kisa");
        } else if (harfSayisi == 3) {
            ucHarfiTersineCevir(kelime);
        } else if (harfSayisi == 4) {
            dortHarfiTersineCevir(kelime);
        } else if (harfSayisi == 5) {
            besHarfiTersineCevir(kelime);
        } else {
            System.out.println("Kelime cok uzun");
        }


    }

    // 1- method oluşturmak için methodun adını yaz ve creat et
    // 2- methoda giderken götürmem gereken variable varsa bunu methoda eklemeliyim
    // o yüzden method ismini yazınca parametre içine variable'ı yaz yani kelime

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("Girdiginiz karakter sayisi: " + kelime.length());
        System.out.println("Kelimenin tersten yazilisi: " + tersKelime);
    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("Girdiginiz karakter sayisi: " + kelime.length());
        System.out.println("Kelimenin tersten yazilisi: " + tersKelime);
    }


    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("Girdiginiz karakter sayisi: " + kelime.length());
        System.out.println("Kelimenin tersten yazilisi: " + tersKelime);

    }


}
