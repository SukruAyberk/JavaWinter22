package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListiTekrarsizYap {

    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayiları sadece 1 tane yapan method
        // ör: [1, 3, 5, 3, 5, 6, 1, 7] -> [1, 3, 5, 6, 7]
        // voidsiz
        // yazdır demediği için voidsiz yaptık

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar);

        sayilar = tekrarsizListeOlustur(sayilar);
        System.out.println(sayilar);

    }

    private static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {

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

        return yeniListe;
    }
}
