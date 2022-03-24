package day13_stringManipulation;

import java.util.Scanner;

public class EskiSoru5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir kelime giriniz.");
        String letter = scan.next();

        if (letter.length() > 5) {
            System.out.println("4 harften daha fazla girdiniz lütfen tekrar deneyin.");
        } else if (letter.length() < 4) {
            System.out.println("4 harften daha az girdiniz lütfen takrar deneyin.");
        } else {
            System.out.println(letter.charAt(letter.length() - 1) + "" + letter.charAt(letter.length() - 2) + "" + letter.charAt(letter.length() - 3) + "" + letter.charAt(letter.length() - 4));
        }
    }
}
