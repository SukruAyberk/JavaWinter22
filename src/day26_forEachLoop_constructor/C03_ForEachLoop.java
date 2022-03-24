package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // Soru 3:
        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
        //kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String[] arr1 = {"Ali", "Ayse", "Can", "Fatma", "Ali"};
        String[] arr2 = {"Can", "Evren", "Emsal", "Fatma", "Emre", "Ali"};

        List<String> ortakElemanlar = new ArrayList<String>();

        // for-each avantajı şu arr1[i] yazmak zorunda kalmadık direkt i yazdık direkt index çağırıyor
        for (String i : arr1) {
            for (String j : arr2) {
                if (i.equals(j)) {
                    if (!ortakElemanlar.contains(i)) {
                        ortakElemanlar.add(i);
                    }

                }
            }
        }

        if (ortakElemanlar.isEmpty()) {
            System.out.println("Ortak eleman yok.");
        } else {
            System.out.println("2 arraydeki ortak elemanlar: " + ortakElemanlar);
        }


    }
}
