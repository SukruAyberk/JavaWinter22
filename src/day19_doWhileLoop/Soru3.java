package day19_doWhileLoop;

import java.util.Scanner;

public class Soru3 {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        // dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Başlangıç değeri: ");
        int baslangic = scan.nextInt();
        System.out.print("Bitiş değeri: ");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <= bitis; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        while (baslangic <= bitis) {
            if (baslangic % 2 == 0) {
                System.out.println(baslangic);
            }
            baslangic++;
        }


    }
}
