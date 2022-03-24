package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarındaki harfleri yazdıran kod

        char ilkHarf = 'm';
        char sonHarf = 't';

        for (char i = ilkHarf; i <= sonHarf; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // başlangıç ve bitiş satıları arasında 0.2 artış miktarı ile oluşacak  tüm sayıları
        double baslangic = 10;
        double bitis = 20;
        double artis = 0.2;

        for (double i = baslangic; i <= bitis; i += artis) {
            System.out.println(i);
        }

    }
}
