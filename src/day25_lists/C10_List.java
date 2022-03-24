package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C10_List {

    public static void main(String[] args) {

        // Bir listede ortalamanın üstünde olan element sayısını bulun

        List<Double> listsayilar = new ArrayList<Double>();
        listsayilar.add(1.0);
        listsayilar.add(3.0);
        listsayilar.add(5.0);
        listsayilar.add(3.0);
        listsayilar.add(5.0);
        listsayilar.add(6.0);
        listsayilar.add(1.0);
        listsayilar.add(7.0);

        double avg = 0;
        double toplam = 0;

        for (int i = 0; i < listsayilar.size(); i++) {
            toplam += listsayilar.get(i);
        }
        avg = toplam / listsayilar.size();
        System.out.println(avg);

        for (int i = 0; i < listsayilar.size(); i++) {
            if (listsayilar.get(i) > avg) {
                System.out.println(listsayilar.get(i));
            }


        }


    }
}
