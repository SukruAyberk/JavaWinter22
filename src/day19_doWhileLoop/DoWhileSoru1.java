package day19_doWhileLoop;

public class DoWhileSoru1 {
    public static void main(String[] args) {

        // 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz

        int sayi = 9;

        do {
            if(sayi % 7 == 0){
                System.out.print(sayi + " ");
            }
            sayi++;
        } while (sayi <= 190);

    }
}
