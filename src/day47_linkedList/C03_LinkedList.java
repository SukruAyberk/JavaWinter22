package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {

    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<Integer>();

        // System.out.println(ll1.element()); // boşken kullanırsak exception fırlatır
        System.out.println(ll1.peek()); // boşken kullanırsak null döndürür
        System.out.println(ll1.poll()); // boşken kullanırsak null döndürür
        System.out.println(ll1.pollFirst()); // boşken kullanırsak null döndürür
        System.out.println(ll1.pollLast()); // boşken kullanırsak null döndürür

        // ll1.pop(); ilk elementi silip bize döndürür ama boş olduğu için exception fırlatır

        ll1.push(30); // en başa element ekler
        ll1.push(20); // en başa element ekler
        System.out.println(ll1); // [20, 30]

        System.out.println(ll1.remove()); // ilk elemanı siler ve bize döndürür 20
        System.out.println(ll1); // [30]
        ll1.push(40);
        ll1.push(50);
        System.out.println(ll1); // [50, 40, 30]

        ll1.remove(50); // object olarak 50'yi siler
        System.out.println(ll1); // [40, 30]

        ll1.push(30); // [30, 40, 30]
        System.out.println(ll1);

        ll1.removeLastOccurrence(30); // son kullanılan 30'u object olarak sildi
        System.out.println(ll1); // [30, 40]

        ll1.push(40);
        System.out.println(ll1); // [40, 30, 40]

        ll1.removeFirstOccurrence(40); // ilk kullanılan 40'ı object olarak sildi
        System.out.println(ll1); // [30, 40]


    }
}
