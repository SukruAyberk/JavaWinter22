package day18_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        // kullanicidan bir rakam alip carpim tablosu olusturalim
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int input = scan.nextInt();

        // 1 2 3  1*1 1*2 1*3
        // 3 4 6  2*1 2*2 2*3
        // 3 6 9  3*1 3*2 3*3

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }

        // outer for loop bir değer aldığında inner for loop baştan sona çalışır
        // inner loop bitince tekrar outer loop'a geçeri ikinci değeri alır
        // inner loop tekrar baştan sonra çalışır
        // outer loop sınırına kadar bu durum devam eder

    }
}
