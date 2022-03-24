package day19_doWhileLoop;

public class DoWhileSoru2 {

    public static void main(String[] args) {

        // ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

        char chr = 'm';

        do {
            System.out.print(chr + " ");
            chr--;
        } while (chr >= 'c');

    }
}
