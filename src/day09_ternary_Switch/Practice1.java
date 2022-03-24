package day09_ternary_Switch;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char harf = scan.next().charAt(0);

        System.out.println(harf >= 'a' && harf <= 'z' ? "Küçük harf girdiniz" : "Büyük harf girdiniz");

    }
}
