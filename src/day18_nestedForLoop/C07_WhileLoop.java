package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // kullanıcıdan kaç sayı toplamak istediğini al
        // ve bu sayıların toplamını ekrana yazdır

        Scanner scan = new Scanner(System.in);
        System.out.print("Toplamak istediğiniz sayı adedini gir: ");
        int sayiAdedi = scan.nextInt();
        int sayi = 0;
        int toplam = 0;

        // for ile

        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.print("Lütfen bir sayi gir: ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Girilen " + sayiAdedi + " sayının toplamı = " + toplam);
    }
}
