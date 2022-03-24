package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        // Yusuf döndürür yani silineni döndürür
        // System.out.println(isimler.set(1, "Seckin"));

        isimler.set(1, "Seckin");
        System.out.println(isimler); // [Aykut, Seckin, Ilker, Oguzhan]

        // daha önceden var olanları da arşiv gibi tutmak istersek
        List<String> logListesi = new ArrayList<String>();

        // isimler listesindeki Ilker'i sildi onun yerine Cosmos yazdı
        // silinen Ilker'i de log listesine ekledi
        logListesi.add(isimler.set(2, "Cosmos"));

        System.out.println(isimler); // [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi); // [Ilker]



    }
}
