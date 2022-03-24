package day25_lists;

import java.util.Arrays;

public class C05_Array {

    public static void main(String[] args) {

        // verilen bir array'den istenen elementi(kaç tane varsa) silip
        // kalanları yeni bir array olarak yazdıran method oluştur

        int[] arr = {3, 4, 2, 3, 5, 7, 3, 8, 2, 4};
        int istenmeyenEleman = 3;

        istenmeyenElementiSil(arr, istenmeyenEleman);

    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        // 1- İstenmeyen element say
        // 2- Yeni array oluştur
        // 3- Eski array'den uygun elementleri yeniye taşı
        // 4- Yeniyi yazdır

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenmeyenEleman) {

                sayac++;
            }
        }
        // böyle yaparsak 3'leri yeni bir arraye atarız ama eski arrayden 3'leri çıkartamayız
        // bu sebeple çözüm bu değil
        // int[] yeniArr = new int[sayac];
        //
        //        for (int i = 0; i < yeniArr.length; i++) {
        //            yeniArr[i] = istenmeyenEleman;
        //        }
        //        System.out.println(Arrays.toString(yeniArr));

        int[] yeniArr = new int[arr.length - 3];

        // bunu yeniArr için oluşturduk yeniArr[i] kabul etmiyor java o yüzden biz kendimiz artırdık
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyenEleman) {
                yeniArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
