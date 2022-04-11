package day_40polymoprhism;

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
            } catch (InputMismatchException e) {
                // e.printStackTrace();
                break;
            }
            toplam += sayi;

        } while (toplam < 500);
        System.out.println("Toplam = " + toplam);

    }


}
