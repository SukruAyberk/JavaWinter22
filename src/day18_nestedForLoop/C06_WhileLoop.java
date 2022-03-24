package day18_nestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // Soru: Kullanıcıdan iki tam sayı alıp bu sayıları ve aralarındaki tüm tam sayıları yazdıran kod

        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayiyi gir: ");
        int baslangic = scan.nextInt();

        System.out.println("İkinci sayiyi gir: ");
        int bitis = scan.nextInt();

        // for ile yapılışı

        for (int i = baslangic; i <= bitis; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // while ile yapılışı

        // böyle yapmayıp başlangıçtan gitseydik başlangıcın değeri değişip 40-60 sınır verseydik 61 olacaktı
        // ama bu şekilde başlangıç değeri değişmeyecek
        int i = baslangic;
        while (i <= bitis) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println(baslangic);

    }
}
