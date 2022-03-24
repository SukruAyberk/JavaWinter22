package day17_forLoop;

import java.util.Scanner;

public class Soru10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı gir: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. sayıyı gir: ");
        int sayi2 = scan.nextInt();
        int toplam = 0;

        girilenSayilarinToplami(sayi1, sayi2, toplam);

    }

    private static void girilenSayilarinToplami(int sayi1, int sayi2, int toplam) {

        for (int i = sayi1; i <= sayi2; i++) {
            toplam += i;
        }
        System.out.println("Sayıların toplamı = " + toplam);

    }
}
