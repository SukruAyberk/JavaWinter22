package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5); // [5]
        sayilar.add(3); // [5, 3]
        sayilar.add(0, 7); // [7, 5, 3]
        sayilar.add(2, 7); // [7, 5, 7, 3]

        // 3'ü index olarak alır. Liste içindeki 3'ü değil 3. indexteki elemanı siliyor
        sayilar.remove(3);
        System.out.println(sayilar); // [7, 5, 7]

        // exception hatası verir çünkü 5. index yok listemizde
        // sayilar.remove(5);

        /*
        Sayılardan oluşan bir list'de objeyi vererek element silme methodu çalışmaz.
        Sayı değeri girdiğimizde Java otomatikmen sayıyı index kabul eder.
         */

        // böyle yaparsak dahi index olarak kabul eder
        // int sayi = 5;
        // sayilar.remove(sayi);

        // Bu şekilde wrapper class kullanırsak index değil sayıyı görür
        // Listemiz Non-Primitive o yüzden sayı değerini almak için wrapper class kullanmamız lazım
        Integer sayi = 5;
        sayilar.remove(sayi);
        System.out.println(sayilar); // [7, 7]

        // ya da bu şekilde de yapabiliriz yukardaki yerine
        // sayilar.remove(Integer.valueOf("5"));


    }
}
