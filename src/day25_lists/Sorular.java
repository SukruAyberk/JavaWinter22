package day25_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorular {

    public static void main(String[] args) {
        // Soru - 1
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("F");
        System.out.println(list);

        // Soru - 2
        list.add("B");
        list.add(1, "L");
        System.out.println(list);

        // Soru - 3
        list.set(3, "D");
        System.out.println(list);

        // Soru - 4
        list.remove("F");
        System.out.println(list);

        // Soru - 5
        Collections.sort(list);
        System.out.println(list);

        // Soru - 6
        System.out.println(list.contains("L"));
        System.out.println(list.contains("M"));

        // Soru - 7
        System.out.println(list.size());

        // Soru - 8
        list.clear();
        System.out.println(list);

        // Sour - 9
        System.out.println(list.isEmpty());
    }
}
