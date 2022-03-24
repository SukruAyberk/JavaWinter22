package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        // soru -1 kullanıcıdan bir tamsayı isteyin ve sayının tek mi çift mi olduğunu yazdır

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayı çifttir");
        } else {
            System.out.println("Sayı tektir");

        }

    }
}
