package day07_ifElseStatements;

import java.util.Scanner;

public class KutsalGun {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen günü giriniz: ");
        String day = scan.next().toLowerCase();

        if (day.equals("cuma")) {
            System.out.println("Müslümanların kutsal günü.");
        } else if (day.equals("cumartesi")) {
            System.out.println("Yahudilerin kutsal günü.");
        } else if (day.equals("pazar")) {
            System.out.println("Hristiyanların kursal günü");
        } else if (day.equals("pazartesi") || day.equals("salı") || day.equals("çarşamba") || day.equals("perşembe")) {
            System.out.println("Haftanın herhangi bir gününü girdiniz.");
        } else {
            System.out.println("herhangi bir gün girmediniz.");
        }

    }
}
