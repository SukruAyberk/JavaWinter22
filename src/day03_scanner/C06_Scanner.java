package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String name = scan.nextLine();
        System.out.print("Lütfen soyisminizi giriniz: ");
        String lastName = scan.nextLine();
        System.out.println("Isim - Soyisim : " + name + " " + lastName);



    }
}
