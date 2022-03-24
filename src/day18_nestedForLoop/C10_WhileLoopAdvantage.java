package day18_nestedForLoop;

import java.util.Scanner;

public class C10_WhileLoopAdvantage {

    public static void main(String[] args) {

        // kullanıcıdan istediği kadar sayı girmesini isteyin
        // kullanıcının sayıların toplamı 500'ü geçerse "artık yeter çok sayı girdin toplam ..... oldu" yazsın

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        while (toplam < 500) {
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Artık yeter çok sayı girdin, toplam = " + toplam + " olur.");

    }
}
