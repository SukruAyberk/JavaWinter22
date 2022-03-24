package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {

        // Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        // sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.print("10'dan kucuk bir sayi girin: ");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        String faktroiyelAcikYazim = "";

        if (sayi > 10) {
            System.out.println("Lutfen 10'dan kucuk bir sayi girin!");
        } else {
            faktoriyelHesaplama(sayi, faktoriyel, faktroiyelAcikYazim);
        }

    }

    private static void faktoriyelHesaplama(int sayi, int faktoriyel, String faktroiyelAcikYazim) {
        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
            if (i != 1) {
                faktroiyelAcikYazim = faktroiyelAcikYazim + i + " * ";
            } else {
                faktroiyelAcikYazim = faktroiyelAcikYazim + i;
            }

        }
        System.out.println(sayi + "! = " + faktroiyelAcikYazim + " = " + faktoriyel);
    }
}
