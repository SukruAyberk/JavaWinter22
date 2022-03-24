package day07_ifElseStatements;

import java.util.Scanner;

public class HarfMiSayiMi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen günü giriniz: ");
        char chr = scan.nextLine().charAt(0);

        if (chr >= 'A' && chr <= 'Z') {
            System.out.println("Büyük harf girdiniz.");
        } else if (chr >= 'a' && chr <= 'z') {
            System.out.println("Küçük harf girdiniz.");
        } else if (chr >= '0' && chr <= '9') {
            System.out.println("Rakam girdiniz.");
        } else {
            System.out.println("Özel karakter girdiniz.");


        }

    }
}
