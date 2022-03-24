package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {

    public static void main(String[] args) {

        // verilen bir arryi büyükten küçüğe sıralayıp bize döndüren method oluştur

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        // int[] tersArr = new int[arr.length]; // bununla yapsaydık orjinali kalırdı ama orjinalini değiştircez o yüzden bunu yapmadık

        arr = terstenSiraliHaleCevir(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static int[] terstenSiraliHaleCevir(int[] arr) {
        Arrays.sort(arr);
        int[] tersArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];
        }

        return tersArr;
    }


}
