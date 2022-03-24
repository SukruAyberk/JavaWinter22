package day17_forLoop;

import java.util.Scanner;

public class Soru5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("100'den küçük sayı gir: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
