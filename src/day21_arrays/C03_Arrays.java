package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        int[] arr; // değer ataması yapmadık ama java kabul etti
        // bunu yazdıramayız çünkü dizinin uzunluğu belli değil

        // arr = {1, 2, 3}; bunu kabul etmez çünkü arrayin büyüklüğü belli değil ama şöyle yapabiliriz
        arr = new int[6];

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        // arraydeki her bir elemanı index değeri kadar artıralım
        for (int i = 0; i <arr.length ; i++) {
            arr[i] += i;
        }
        // for içine yazarsak her adımda her bir index için yazdırır toplu olarak bütün indexlerin değerlerini yazdırmak istiyorsak for dışında yazdırdık
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]


        // son indexteki elementi yazdıralım
        System.out.println(arr[arr.length - 1]); // 5

        System.out.println(arr[3]); // 3


    }
}
