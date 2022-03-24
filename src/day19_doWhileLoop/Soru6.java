package day19_doWhileLoop;

import java.util.Scanner;

public class Soru6 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        // olduklarini ekranda yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi: ");
        int sayi = scan.nextInt();
        int bolen = 1;
        int bolenAdedi = 0;

        while (bolen <= sayi) {
            if (sayi % bolen == 0) {
                System.out.print(bolen + " ");
                bolenAdedi++;
            }
            bolen++;
        }
        System.out.println();
        System.out.println("Toplamda " + bolenAdedi + " sayı " + sayi + " sayısını tam bölebilir.");

        // for (int i = 1; i <= sayi ; i++) {
        //            if (sayi % i == 0) {
        //                System.out.print(i + " ");
        //                bolenAdedi++;
        //            }
        //        }
        //        System.out.println();
        //        System.out.println("Toplamda " + bolenAdedi + " sayı " + sayi + " sayısını tam bölebilir.");
        //
        //        System.out.println("-----------------------");

        bolenMethod(sayi);


    }

    private static void bolenMethod(int sayi) {
        int bolen = 1;
        int bolenAdedi = 0;

        while (bolen <= sayi) {
            if (sayi % bolen == 0) {
                System.out.print(bolen + " ");
                bolenAdedi++;
            }
            bolen++;
        }
        System.out.println();
        System.out.println("Toplamda " + bolenAdedi + " sayı " + sayi + " sayısını tam bölebilir.");


    }


}
