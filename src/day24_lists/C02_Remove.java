package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oğuzhan");

        System.out.println(isimler);

        // "aykut" yazarsam Aykut'u silmez büyük harf küçük harf önemli
        // remove (istenenObject) methodu istenen elementi kaldırıp bize true/false döndürür
        // Eğer remove işleminin yapıldığını kontrol etmek istiyorsanız methodu boolean bir variable'a atayabilirsiniz
        // Sonucu kullanıcıya yazdırmak isterseniz if else ile istediğiniz değerlendirmeyi yazabilirsiniz
        boolean sonuc = isimler.remove("Aykut"); // true

        if (sonuc == true) {
            System.out.println("İstediğiniz isim silindi");
        } else {
            System.out.println("İstediğiniz isim listede olmadığı için silinemedi");
        }
        System.out.println(isimler); // [Yusuf, İlker, Oğuzhan]

        sonuc = isimler.remove("Berk");
        if (sonuc == true) {
            System.out.println("İstediğiniz isim silindi");
        } else {
            System.out.println("İstediğiniz isim listede olmadığı için silinemedi");
        }

        // remove(index) yazdığımızda sildim/silmedim ihtimali kalmaz
        // eğer olmayan bir index yazdırırsa java exception verir

        // [Yusuf, İlker, Oğuzhan] liste bu halde şuan
        // İlker'i siler ve delil olurak İlker ismini bize döndürür
        // System.out.println(isimler.remove(1));
        isimler.remove(1);

        // yazdırsak da yazdrımasak da liste değişti ve birinci indexteki element değiş
        // ahanda buda kanıtı
        System.out.println(isimler); // [Yusuf, Oğuzhan]


    }
}
