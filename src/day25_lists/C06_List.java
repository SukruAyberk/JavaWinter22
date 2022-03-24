package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

    public static void main(String[] args) {

        // C05_Array'deki soruyu List olarak daha kolay yapacağız
        // Verilen bir array'den istenen elementi(kaç tane varsa) silip
        // kalanları yeni bir array olarak yazdıran method oluştur

        int[] arr = {3, 4, 2, 3, 5, 7, 3, 8, 2, 4};
        int istenmeyenEleman = 3;

        istenmeyenElementiSilVeYazdir(arr, istenmeyenEleman);

    }

    private static void istenmeyenElementiSilVeYazdir(int[] arr, int istenmeyenEleman) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyenEleman) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);

    }
}
