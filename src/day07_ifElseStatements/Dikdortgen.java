package day07_ifElseStatements;

import java.util.Scanner;

public class Dikdortgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen birinci kenar uzunluğunu giriniz giriniz: ");
        int kenar1 = scan.nextInt();

        System.out.print("Lütfen ikinci kenar uzunluğunu giriniz giriniz: ");
        int kenar2 = scan.nextInt();

        if (kenar1 == kenar2) {
            System.out.println("Bu dörtgen karedir.");
        } else {
            System.out.println("Bu dikdörtgendir.");

        }

    }
}
