package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yarıçap değerini giriniz: ");
        double r = scan.nextDouble();
        double cevre, alan;
        cevre = 2* Math.PI*r;
        alan = Math.PI*(Math.pow(r, 2));
        System.out.println("Çevre = " + cevre + " Alan = " + alan);
    }
}
