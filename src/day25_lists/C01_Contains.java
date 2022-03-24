package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("D"); // [D]
        harfler.add("M"); // [D, M]
        harfler.add(1, "T"); // [D, T, M]
        harfler.add(0, "T"); // [T, D, T, M]

        System.out.println(harfler); // [T, D, T, M]

        System.out.println(harfler.contains("T")); // true
        System.out.println(harfler.contains("A")); // false

        List<String> karakterler = new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");

        System.out.println(karakterler); // [M, T]

        // contains'de sıra önemli değildir
        System.out.println(harfler.containsAll(karakterler)); // true

        // T ve M var ama F olmadığı için false döndü
        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler)); // false
    }
}
