package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); // [5, 7, 8, 6, 9]

        // iterator methodu oluşturduğumuz liste objesi üzerinden
        // arraylist classından çalıştırıyoruz
        Iterator itr = liste.iterator();

        /*
        iterator nasıl çalışır
        bir iterator objesi oluşturmak için collection üyesi bir obje kullanmalıyız
        Yani biz bu iterator objesini bizim örneğimizde liste objesi üzerinde çalışmak için
        oluşturmuş olduk
        Biz iterator objesini oluşturduğumuzda,
        iterator collection'ın ilk elementinin öncesine gidip bekler

        [(itr)5, 7, 8, 6, 9]

        itr.hasNext(); -> true

        itr.next(); iterator bir sonraki elementin yanına geçer ve üzerinden
                    geçtiği elementi bize döndürür

        [5, (itr)7, 8, 6, 9] -> bize 5 döndürür

        itr.next();

        [5, 7, (itr)8, 6, 9] -> bize 7 döndürür
         */

        System.out.println(itr.hasNext()); // true
        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7
        itr.remove(); // en son alıp nextle bize döndürdüğü elementi siler
        System.out.println(liste); // [5, 8, 6, 9]

        // itr.remove(); next diyip yeni bir elementin yanın geçirmedik
        // yani elinde bir element yok biz olmayan elementin silinmesini istedik
        // Exception fırlattı
        // Dolayısıyla üst üste iki kere remove kullanılamaz

    }
}
