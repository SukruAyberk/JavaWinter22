package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {

    public static void main(String[] args) {

        /*
        non-primitive data türlerinde objenin kendisi değilde içindeki elementler değişirse
        Java objenin referansı ve objenin kendisi değişmediği için
        element değişikliklerini kabul eder ve kalıcı yapar
         */

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        arrDegistir(arr);

        // obje değil içindeki değerler değişti o yüzden en son hali en yeni hali olur
        // her zaman yaptığımız şey aslında array ve listlerde değiştirip aynı obje ile
        // yeni değerli halini kullanıyorduk
        System.out.println("Method call sonrası: " + Arrays.toString(arr)); // Method call sonrası: [5, 6, 3]

    }

    private static void arrDegistir(int[] arr) {

        // burada objeyi değil değerleri değiştirdik
        arr[0] = 5;
        arr[1] = 6;
        System.out.println(Arrays.toString(arr)); // [5, 6, 3]
    }
}
