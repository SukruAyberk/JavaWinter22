package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaiciHaftasonu {

    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen günü giriniz: ");

        String gun = scan.nextLine().toLowerCase();

        /*
        if (gun.equals("Pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Gün = " + gun);
            System.out.println("Haftaiçi");
        } else if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Gün = " + gun);
            System.out.println("Haftasonu");
        }
        */

        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Gün = " + gun);
            System.out.println("Haftaiçi");

        } else if(gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Gün= " + gun);
            System.out.println("Haftasonu");
        } else {
            System.out.println("Herhangi bir gün girmediniz.");
        }

    }
}
