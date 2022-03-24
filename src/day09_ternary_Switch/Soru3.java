package day09_ternary_Switch;

import java.util.Scanner;

public class Soru3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();

        switch (sayi) {
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Üç basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dört basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdiğiniz sayıyı değiştirin");
        }

    }
}
