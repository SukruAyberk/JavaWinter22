package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_ListedenTekrarliElemenleriSilme {

    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayiları sadece 1 kere yazdıran method
        // ör: [1, 3, 5, 3, 5, 1, 7] -> [1, 3, 5, 7]
        // voidli (C08_ListiTekrarsizYap classında voidsiz yapımı var)
        // yazdır dediği için voidli yaptık

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar);

        tekrarEdeniSilenMethod(sayilar);


    }

    public static void tekrarEdeniSilenMethod(List<Integer> sayilar) {

        List<Integer> yeniListe = new ArrayList<Integer>();

        for (int i = 0; i < sayilar.size(); i++) {

            // yeniListe[i] diyemiyoruz çünkü bu bir liste o yüzde get kullandık
            if (!yeniListe.contains(sayilar.get(i))) {

                // yeniListe[i] = sayilar[i] diyemiyoruz
                // zaten add komutumuz var onu kullnadık
                // yeniListe.add ama neyi ekleyecek?
                // sayilar listesindeki i indexindeki elemanı ekleyecek
                // o yüzden get(i) dedik
                yeniListe.add(sayilar.get(i));
            }
        }

        System.out.println(yeniListe);
    }


}
