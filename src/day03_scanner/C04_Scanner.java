package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println(isim);

    }
}
