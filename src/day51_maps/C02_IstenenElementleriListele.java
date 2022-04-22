package day51_maps;

import day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class C02_IstenenElementleriListele {

    /*
    Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
    map➔ { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
    Istenen dil ➔ java
    Sonuc ➔ [Ali, Veli
     */

    public static void main(String[] args) {

        Map<Integer, String> sinifMapi = MapOlustur.myMap();
        String istenenDil = "Java";
        List<String> istenenDiliBilenlerListesi = istenenDiliBilenListesiOlustur(sinifMapi, istenenDil);

        System.out.println(istenenDiliBilenlerListesi);
    }

    public static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMapi, String istenenDil) {

        // day 50'ye göre yapıyoruz

        List<String> istenenDiliBilenlerListesi = new ArrayList<>();
        istenenDiliBilenlerListesi.addAll(sinifMapi.values());
        int outerArrayBoyut = istenenDiliBilenlerListesi.size();

        String ilkValue = istenenDiliBilenlerListesi.get(0);
        System.out.println(ilkValue);
        String[] ilkValueArr = ilkValue.split(", ");
        //System.out.println(Arrays.toString(ilkValueArr));
        int innerArrayBoyut = ilkValueArr.length;

        String[][] valueMDArr = new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i < outerArrayBoyut; i++) {
            String[] temp = istenenDiliBilenlerListesi.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDArr[i][j] = temp[j];
            }
        }

        for (int i = 0; i < outerArrayBoyut; i++) {
            if (valueMDArr[i][2].equals(istenenDil)) {
                istenenDiliBilenlerListesi.add(valueMDArr[i][0]);
            }
        }

        return istenenDiliBilenlerListesi;
    }
}
