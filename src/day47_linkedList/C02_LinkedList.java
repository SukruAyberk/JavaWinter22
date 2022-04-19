package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {

    public static void main(String[] args) {

        // Listten gelen özellikleri biliyoruz
        // onun için Deque'den gelen özelliklere bakalım

        Deque<Integer> ll1 = new LinkedList<Integer>();
        ll1.addFirst(10); // başa element ekler add() methoduna göre daha hızlı
        ll1.addLast(20); // sona element ekler add() methoduna göre daha hızlı
        System.out.println(ll1);
        System.out.println(ll1.element()); // ilk elementi silmeden bize döndürür ilkelement yoksa exception fırlatır
        System.out.println(ll1); // [10, 20]

        System.out.println(ll1.getLast()); // son elementi döndürür
        System.out.println(ll1.getFirst()); // ilk elementi döndürür
        System.out.println(ll1); // [10, 20]

        ll1.offer(30); // sona ekler ama bize bir şey döndürmez
        System.out.println(ll1); // [10, 20, 30]
        ll1.offerLast(40); // sona ekler bize true döndürür
        System.out.println(ll1); // [10, 20, 30, 40]
        ll1.offerFirst(50); // başa ekler bize true döndürür
        System.out.println(ll1); // [50, 10, 20, 30, 40]

        System.out.println(ll1.peek()); // ilk elementi silmeden bize döndürür bulamazsa bull döndürür

        ll1.poll();
    }
}
