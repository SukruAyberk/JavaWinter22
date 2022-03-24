package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Clear {

    public static void main(String[] args) {

        List<String> hayvan = new ArrayList<>();
        hayvan.add("yilan"); // [yilan]
        hayvan.add("kedi"); // [yilan, kedi]

        System.out.println(hayvan.size()); // 2
        System.out.println(hayvan.isEmpty()); // false

        hayvan.clear();
        System.out.println(hayvan.size()); // 0
        System.out.println(hayvan.isEmpty()); // true

    }
}
