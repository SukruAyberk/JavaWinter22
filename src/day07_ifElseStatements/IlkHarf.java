package day07_ifElseStatements;

import java.util.Scanner;

public class IlkHarf {

    public static void main(String[] args) {

        //2. soru

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen günün ilk ilk harfini giriniz: ");
        String letter = scan.next().toLowerCase();

        if (letter.equals("p")) {
            System.out.println("Pazartesi, Perşembe veya Pazar.");
        } else if (letter.equals("s")) {
            System.out.println("Salı.");
        } else if (letter.equals("ç")){
            System.out.println("Çarşamba.");
        } else if (letter.equals("c")) {
            System.out.println("Cuma veya Cumartesi.");
        } else {
            System.out.println("Herhangi bir günün baş harfini girmediniz.");
        }


    }
}
