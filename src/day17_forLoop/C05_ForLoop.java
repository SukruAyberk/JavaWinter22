package day17_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("100'den küçük sayı gir: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }

        }


    }
}
