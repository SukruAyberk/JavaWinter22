package day45_interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); // [5, 7, 8, 6, 9]

        for (Integer i : liste) {
            i = i + 2;
        }

        // output yine aynı kalıcı değişim olmadı
        // iterator ile kalıcı hale getirceğiz aradaki fark bu
        System.out.println(liste); // [5, 7, 8, 6, 9]

        /*
        liste objesi üzerinden iterator(); methodunu çalıştırıyoruz
        List Interfaceinden iterator(); methodunu getirdik
        ama methodu hemen çalıştımıyor çünkü override var mı diye bakacak
         */
        Iterator itr = liste.iterator();


    }


}
