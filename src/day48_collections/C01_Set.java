package day48_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {

    public static void main(String[] args) {

        Integer[] arr = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8};
        System.out.println(Arrays.toString(arr)); // [3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8]
        arrayiTekrarsizYazdir(arr);

    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi = new HashSet<Integer>();
        for (Integer i : arr) {
            tekrarsizElementKumesi.add(i);
        }
        System.out.println(tekrarsizElementKumesi); // [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
