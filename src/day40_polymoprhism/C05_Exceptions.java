package day40_polymoprhism;

import java.util.Scanner;

public class C05_Exceptions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;
        int kontrol = 0;

            while (kontrol != 2) {

                System.out.print("Bölmek istediğiniz sayıyı yazınız: ");
                sayi1 = scan.nextInt();

                System.out.print("Kaça bölmek istediğinizi yazınız: ");
                sayi2 = scan.nextInt();

                try {
                    System.out.println("Sonuc = " + sayi1 / sayi2);
                } catch (ArithmeticException e) {
                    // e.printStackTrace();
                    System.out.println(sayi1 + " / " + sayi2 + " tanımsızdır");
                }

                System.out.println("devam etmek için 1\nbitirmek için 2'ye basın");
                kontrol = scan.nextInt();

            }

    }

}
