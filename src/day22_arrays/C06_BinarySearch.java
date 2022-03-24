package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {

    public static void main(String[] args) {

        // Eğer Java'da hazır binary search yapmak isterseniz
        // önce sort methodunu kullanıp sonra binary search yapmalıyız
        // binarySearh() methodu bize istenen sayının olduğu indexi verir
        // olan sayılar index döndürür
        // olmayan sayılar - ve sıra döndürür

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 3;

        // önce sıraladık
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]

        // arr içinden istenenSayiyi ara dedik
        // cevap 2 çıkacak çünkü 3'ün indexini döndürdü
        System.out.println(Arrays.binarySearch(arr, istenenSayi)); // 2

        // Java cevabı bulamadığını göstermek için önce - yazdırır
        // sonrada o sayı olsaydı sıralaması ne olacak ise o sırayı bize verir
        // 10 için -9 döndürdü
        // 10 olmadığı için - yazdı sonrada 10 olsaydı 9. indexte olacağını yazdı
        istenenSayi = 10;
        System.out.println(Arrays.binarySearch(arr, istenenSayi)); // -9

        // -10 için -1 döndürdü
        // -10 olmadığı için - yazdı sonrada -10 olsaydı 1. indexte olacağını yazdı
        // ama bizim arrayimizde 0 da var ama java anlamamız için sıfırı kullanmıyor o yüzden sıfır yokmuş gibi ilk indexte -10 olurdu dedi
        istenenSayi = -10;
        System.out.println(Arrays.binarySearch(arr, istenenSayi)); // -1


    }
}
