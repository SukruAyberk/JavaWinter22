package day22_arrays;

import java.util.Arrays;

public class C02_Sort {

    public static void main(String[] args) {

        // verilen bir arrayde en kucuk ve en büyük değeri yazdır

        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0, -5};

        // sort komutu olmadan

        // bunu mümkün olan en büyük sayı seçmeliyiz çünkü dizi içinde 0 olmayabilir
        // öyle bir durumda dizide olmayan ama bizim atadığımız değer olan 0 çıktısı gelir
        // biz buna en büyük sayıyı verelim ki dizideki her sayı bundan küçük oludğu için kendi aralarında karşılaştırılabilsin
        // ya da arrayin ilk elemanını atarız int enKucuk = arr[0];
        int enKucuk = Integer.MAX_VALUE;
        int enBuyuk = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < enKucuk) {
                enKucuk = arr[i];
            }
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
            }

        }

        System.out.println("En küçük sayı = " + enKucuk);
        System.out.println("En büyük sayı = " + enBuyuk);

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);


    }
}
