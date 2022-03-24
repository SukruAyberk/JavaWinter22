package day06_concatenation_operators;

public class C02_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5 + 2 == 8);

        boolean sonuc1 = 5>4 && 7<9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc1);

        boolean sonuc2 = 5>4 && 7>9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc2);

        boolean sonuc3 = 5>4 & 7>9 & 6 + 3 == 9 & 5 + 2 != 8;
        System.out.println(sonuc3);


        // sayı3 ün 10-20 arasında olduğunu ispatla
        int sayi3 = 15;
        System.out.println(10 < sayi3 && sayi3<20);

        // sayi 4ün 10 ile 20 arasında olmadığını true olarak döndür
        int sayi4 = 5;
        System.out.println(sayi4 < 10 || sayi4 > 20); // && koysaydık false dönerdi || koyduk true döndü 

    }
}
