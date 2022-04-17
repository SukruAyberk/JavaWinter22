package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {

    public static void main(String[] args) {
        // hem List, hem de Queue'nun child classıdır
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(10); // add methodu listten geldiği için hep sona ekler
        System.out.println(list); // [5, 10]
        list.addFirst(11); // başa ekler addFirst deque'den gelir
        System.out.println(list); // [11, 5, 10]
        list.addLast(12); // sona ekler addLast deque'den gelir
        System.out.println(list); // [11, 5, 10, 12]
        list.add(2, 25);
        System.out.println(list); // [11, 5, 25, 10, 12]

        


    }
}
