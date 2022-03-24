package day09_ternary_Switch;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        String harf = scan.next().toUpperCase();

        switch (harf) {
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz!");
        }

    }
}
