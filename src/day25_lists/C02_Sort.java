package day25_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_Sort {

    public static void main(String[] args) {

        List<String> hayvan = new ArrayList<>();
        hayvan.add("yilan"); // [yilan]
        hayvan.add("kedi"); // [yilan, kedi]
        hayvan.add("tavsan"); // [yilan, kedi, tavsan]

        System.out.println(hayvan); // [yilan, kedi, tavsan]

        Collections.sort(hayvan);
        System.out.println(hayvan); // [kedi, tavsan, yilan]

    }

}
