package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {


    public static void main(String[] args) {

        // verilen bir arryi büyükten küçüğe sıralayıp yazdıran method oluştur

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        buyuktenKucugeSiralama(arr);

        // burada en büyük birinci element olmaz çünkü kaydetmedik kaydolması için döndürerek bir sonraki methodda yapıcaz

    }

    private static void buyuktenKucugeSiralama(int[] arr) {

        Arrays.sort(arr); // küçükten büyüğe sıraladık ama tersi lazım bize

        int[] tersArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i] =arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(tersArr));
    }


}
