package day25_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Equals {

    public static void main(String[] args) {

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

        System.out.println(first.equals(second)); // true

        first.add("a");
        System.out.println(first.equals(second)); // false

        second.add("a");
        System.out.println(first.equals(second)); // true

        first.add("b");
        second.add(0, "b");

        System.out.println(first); // [a, b]
        System.out.println(second); // [b, a]
        System.out.println(first.equals(second)); // false

    }
}
