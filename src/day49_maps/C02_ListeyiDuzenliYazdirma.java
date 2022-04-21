package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {

    public static void main(String[] args) {
        // Sınıf listesini düzenli bir şekilde yazdırmak
        Map<Integer, String> sinif = MapOlustur.myMap();
        System.out.println(sinif); // {101=Ayberk, Gürfidan, QA, 102=Veli, Yan, Dev, 103=Ali, Yan, C#}
        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {


        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("=========================");

        // Map yapısında yazdırdığımızda kullanıcılar bir şey anlamayabilir
        // bunun için önce Map yapısını kodlarla manipüle edip
        // mapdeki dataları, istediğimiz formata sokmamız gerekir
        // 1. adım key ve valueları mapden alıp iki farklı collection üyesine atadık
        Set<Integer> keySet = sinif.keySet();
        Collection<String> valueSet = sinif.values(); // Set yapacaktık ama CTE verdi o yüzden collection yaptık
        System.out.println(keySet); // [101, 102, 103]
        System.out.println(valueSet); // [Ayberk, Gürfidan, QA, Veli, Yan, Dev, Ali, Yan, C#]
        System.out.println(valueSet.size()); // 3 verdi çünkü "Ayberk, Gürfidan, QA" bir Stringdir

        for (String i : valueSet) {
            System.out.println(i);
        }

    }
}
