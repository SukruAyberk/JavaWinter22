package day13_stringManipulation;

import java.util.Scanner;

public class EskiSoru7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi girin: ");
        String name = scan.nextLine();

        System.out.print("Lütfen soyisminizi girin: ");
        String lastName = scan.nextLine();

        System.out.print("Lütfen kart numaranızı girin: ");
        String num = scan.nextLine();

        String classifiedName = name.substring(1, name.length()).replaceAll("\\w", "*");
        String classifiedLastName = lastName.substring(0, name.length()).replaceAll("\\w", "*");
        String classifiedNum = num.substring(0, 15).replaceAll("\\w", "*");

        System.out.println("İsminiz-Soyisminiz: " + name.charAt(0) + "" + classifiedName + " " + lastName.charAt(0) + "" + classifiedLastName);
        System.out.println("Kart numaranız: " + classifiedNum + "" + num.substring(15, 19));


    }
}
