package day13_stringManipulation;

import java.util.Scanner;

public class EskiSoru4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String name = scan.nextLine();

        System.out.print("Lütfen soyadınızı giriniz: ");
        String lastName = scan.nextLine();

        System.out.println("İsminizi uzunluğu: " + name.length());
        System.out.println("Soyadınızın uzunluğu: " + lastName.length());

        if (name.length() > lastName.length()) {
            System.out.println("İsminizin uzunluğu soyadınızdan büyük.");
        } else if (lastName.length() > name.length()) {
            System.out.println("Soyadınızın uzunluğu isminizden fazla");
        } else {
            System.out.println("İsminizin ve soyadınızın uzunluğu eşit. ");
        }

    }
}
