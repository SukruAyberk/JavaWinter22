package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<String, Integer>();

        /*
        ikisi arasındaki farkı şu
        ilki direkt koyacak, önceden varsa eskiyi ezecek yeniyi koyacak
        diğeri eskiyi ezmeyecek kontrol edecek
         */
        myMap.put("H", 3);
        myMap.putIfAbsent("K", 5);

        // bir ekleme yapmak istediğimizde key daha önce eklenmemişse mape eklesin
        // daha önceden eklenmişse eskiyi silmemek için bizi uyarsın
        System.out.println(myMap.putIfAbsent("A", 6)); // null
        System.out.println(myMap.putIfAbsent("K", 20)); // 5

        if (myMap.putIfAbsent("K", 30) != null) {
            System.out.println("Girdiğinz Key zaten Map'de var");
        }
        System.out.println(myMap); // {A=6, H=3, K=5}

        // güncelleme yapmak
        // computeIfAbesent yoksa yapıyor
        // compute her halukarda yapar
        myMap.computeIfAbsent("A", v -> 20);
        System.out.println(myMap); // {A=6, H=3, K=5}

        myMap.compute("A", (key, value) -> 20);
        System.out.println(myMap); // {A=20, H=3, K=5}

        // H'nin değerini 2 katının 5 fazlası yapalım
        myMap.compute("H", (k, v) -> (2 * v + 5));
        System.out.println(myMap); // {A=20, H=11, K=5}

        //jdk11'e geçildi

    }
}
