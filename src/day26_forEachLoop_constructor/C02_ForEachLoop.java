package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {

    public static void main(String[] args) {

        // Soru - 10 elementli bir list oluşturalım

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> sayilar = new ArrayList<Integer>();

        for (int i : arr) {
            sayilar.add(i);
        }
        System.out.println(sayilar);

        // sayilar listesinde 3'e bölünemeyen sayıları for each ile yazdır

        for (int i : sayilar) {

            if (i % 3 != 0) {
                System.out.print(i + " ");
            }

        }

    }
}
