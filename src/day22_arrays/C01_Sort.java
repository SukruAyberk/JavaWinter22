package day22_arrays;

import java.util.Arrays;

public class C01_Sort {

    public static void main(String[] args) {

        String arr[] = {"S", "M", "A", "T" };
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // harfleri alfabetik sıraya soktu
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {5, 2, 6, 9};
        Arrays.sort(arr2); // rakamları kküçükten büyüğe sıraladı
        System.out.println(Arrays.toString(arr2));

        // sort komutu sayıları küçükten büyüğe metinleri alfabetik sıraya sokar

    }
}
