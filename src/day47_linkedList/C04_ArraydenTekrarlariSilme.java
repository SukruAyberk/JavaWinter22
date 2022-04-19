package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlariSilme {

    public static void main(String[] args) {

        // verilen bir arrayden tekrar eden elementleri silip
        // unique elementlerden oluşan bir array haline döndüren bir method oluştur

        Integer[] arr = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8};
        System.out.println(Arrays.toString(arr)); // [3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8]

        arr = benzersizYap(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8]

    }

    private static Integer[] benzersizYap(Integer[] arr) {

        // Set(Küme) unique elementlerden oluşur
        // yani içinde zaten bir 3 varsa ve ben tekrardan bir 3 atmaya çalışırsam
        // eskisini siler yanisini koyar

        // burası treeset olursa doğal sıralama yapar
        // HashSet olursa sıralama yapmak zorunda değil
        Set<Integer> benzersizSet = new TreeSet<>();

        for (Integer i : arr) {
            benzersizSet.add(i);
        }
        System.out.println(benzersizSet); // [1, 2, 3, 4, 5, 6, 7, 8]

        // setlerde index yapısı yoktur
        // bu sebeple setlerde forloop yerine foreach loop kullnıyoruz

        Integer[] arrBenzersiz = new Integer[benzersizSet.size()];
        int index = 0;

        for (Integer i : benzersizSet) {
            arrBenzersiz[index] = i;
            index++;
        }

        return arrBenzersiz;
    }
}
