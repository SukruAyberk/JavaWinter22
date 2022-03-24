package day07_ifElseStatements;

import java.util.Scanner;

public class Ucgen {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci kenar uzunluğunu giriniz giriniz: ");
        int kenar1 = scan.nextInt();

        System.out.print("Lütfen ikinci kenar uzunluğunu giriniz giriniz: ");
        int kenar2 = scan.nextInt();

        System.out.print("Lütfen üçüncü kenar uzunluğunu giriniz giriniz: ");
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Eşkenar üçgen.");
        } else {
            System.out.println("Normal üçgen");
        }

    }
}
