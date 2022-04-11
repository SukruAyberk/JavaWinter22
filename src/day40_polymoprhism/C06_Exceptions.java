package day40_polymoprhism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_Exceptions {

    /*
    Kullanıcıdan istediği kadar sayıyı alıp toplayan bir program yaz
    Toplam 500'ü geçerse bitirsin veya
    Kullanıcı bitirmek istediğinde q'ya basmalı
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        do {
            System.out.print("Bir sayı girin: ");
            try {
                sayi = scan.nextInt();
                toplam += sayi;
            } catch (InputMismatchException e) {
                String hataliGiris = scan.next();
                if (hataliGiris.equalsIgnoreCase("q")) {
                    System.out.println("Girdiğiniz sayıların toplamı: " + toplam);
                    break;
                } else {
                    System.out.println("Hatalı giriş yaptınız, bitirmek için q'ya bas.");
                }
            }
        } while (toplam < 500);
        System.out.println("Toplam = " + toplam);
    }
}
