package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen günü giriniz: ");
        char chr = scan.nextLine().charAt(0);

        if (chr >= 'A' && chr <= 'Z' || chr >= 'a' && chr <= 'z') {
            System.out.println("Harf girdiniz.");
        } else if (chr >= '0' && chr <= '9') {
            System.out.println("Rakam girdiniz.");
        } else {
            System.out.println("Özel karakter girdiniz.");

        }

        Character.isLetter(chr);

    }
}
