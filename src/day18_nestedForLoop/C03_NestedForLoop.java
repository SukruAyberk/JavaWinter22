package day18_nestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        // Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //        *
        //        * *
        //        * * *
        //        * * * *

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi1 = scan.nextInt();

        // bunu yaparsak dikdörtgen formatında sınırları belirleyebiliriz
        // System.out.print("Bir sayi girin: ");
        // int sayi2 = scan.nextInt();

        ucgenOlustur(sayi1);

    }

    private static void ucgenOlustur(int sayi1) {

        for (int i = 1; i <= sayi1; i++) {
            for (int j = 1; j <= i; j++) {
                // nested for loop ya dikdörtgen ya da üçgen formatında olur
                // dikdörtgen istediğimizde iki loop içinde bağımsız end poin(sayi) belirleriz
                // ğçgen için outer loop end point inner loop outer loopa kadar gitmeli

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
