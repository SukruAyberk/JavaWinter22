package day19_doWhileLoop;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        // kullanıcıdan pozitif bir tamsayı alıp while loop ile sayıdan küçük pozitif tam sayıları yazdır

        int input = 3;
        int sayi = 1;

        while (sayi < input) {
            System.out.println(sayi);
            sayi++;
        }
        // 2 sayı yazdırır 3 kere kontrol eder

        // Aynı soruyu do while loop ile yapalım

        sayi = 1;

        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < input);

        // 2 sayı yazdırır 2 kere kontrol eder
    }
}
