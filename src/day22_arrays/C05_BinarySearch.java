package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        // verilen array'de istenen bir elementin var olup olmadığını true/false yazdırarak
        // gösteren bir method oluşturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 1;

        istenenElemanVarMi(arr, istenenSayi);


    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        // burada bir sonuc tanımladık o yüzden içerde false için bağımsız bir if'e gerek kalmadı

        boolean sonuc = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenenSayi) {
                sonuc = true;
                break;
            }
        }
        // bunu for dışında yazabiliriz eğer if içinde true çıkarsa bize true yazdıracak
        // eğer if'de true çıkmazsa başlangıç değeri zaten false, o yüzden false yazdıracak
        System.out.println(sonuc);

    }
}
