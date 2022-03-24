package day18_nestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi1 = scan.nextInt();

        sekilOlustur(sayi1);

    }

    private static void sekilOlustur(int sayi1) {

        for (int i = 1; i <= sayi1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // sayi yazarsak outer'a en alta ekstradan boş bir satır koyuyuor sayi -1 yazarsak ekstra boş satır koymuyor
        // edit: sayi - 1 yapmak yerine sayi yapsak da olur
        for (int i = 1; i <= sayi1 - 1; i++) {

            // sayi - i'nin mantığı ise
            // orta kısmı geçtikten sonra sayi - i kadar yazalım aşağıya doğru azalsın
            for (int j = 1; j <= sayi1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
