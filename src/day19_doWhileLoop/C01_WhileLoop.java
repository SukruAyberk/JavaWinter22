package day19_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        // olduklarini ekranda yazdirin

        // for ilede yapılabilir ama while ile çözümü yapıcaz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scan.nextInt();

        int bolen = 1;
        int sayac = 0; // bolenlerin sayısı


        while (bolen <= sayi) {

            if (sayi % bolen == 0) {
                System.out.print(bolen + " ");
                sayac++;
            }
            bolen++; // artırmazsak hep 1 ile böler ve while 1 <= 20 olduğu için sürekli bunu çalıştırır yani sonsuz loop olur
        }

        System.out.println();
        System.out.println(sayi + " sayısını bölen " + sayac + " adet sayı vardır.");
    }
}
