package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class RetainAll {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set2.addAll(set1);
        set2.add(25);
        set2.add(30);
        System.out.println("Set1: " + set1); // Set1: [20, 10]
        System.out.println("Set2: " + set2); // Set2: [20, 25, 10, 30]

        // set2'ye git set1'in elementleri dışında ne varsa sil dedik
        // bu sayede 2 seti birbirine eşit hale getirdik
        System.out.println(set2.retainAll(set1)); // true

        System.out.println("Set1: " + set1); // Set1: [20, 10]
        System.out.println("Set2: " + set2); // Set2: [20, 10]


    }
}
