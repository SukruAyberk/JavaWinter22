package day09_ternary_Switch;

import java.util.Scanner;

public class Soru5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen günü giriniz: ");
        String gun = scan.next().toUpperCase();

        switch (gun) {
            case "PAZARTESİ":
            case "SALI":
            case "ÇARŞAMBA":
            case "PERŞEMBE":
            case "CUMA":
                System.out.println("Haftaiçi");
                break;
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println("Haftasonu");

        }

    }
}
