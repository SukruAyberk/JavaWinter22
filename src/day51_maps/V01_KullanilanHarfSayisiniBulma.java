package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class V01_KullanilanHarfSayisiniBulma {

    /*
        Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method
        yaziniz
        Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3

         */

    public static void main(String[] args) {

        String input = "Hellooo";
        String[] harfler = input.split("");

        Map<String, Integer> kullanimSayilari = new HashMap<String, Integer>();

        for (String i : harfler) {
            if (!kullanimSayilari.containsKey(i)) {
                kullanimSayilari.put(i, 1);
            } else {
                kullanimSayilari.put(i, kullanimSayilari.get(i) + 1);
            }
        }
        System.out.println(kullanimSayilari); // {e=1, H=1, l=2, o=3}
    }
}
