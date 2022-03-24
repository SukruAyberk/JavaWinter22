package day17_forLoop;

import java.util.Scanner;

public class Soru11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("10'dan küçük sayı gir: ");
        int sayi = scan.nextInt();
        int faktöriyel = 1;

        faktöriyelSonuc(sayi, faktöriyel);

    }

    private static void faktöriyelSonuc(int sayi, int faktöriyel) {

        for (int i = sayi; i >= 1; i--) {
            faktöriyel *= i;
        }
        System.out.println(sayi + " sayısının faktöriyeli = " + faktöriyel);

    }
}
