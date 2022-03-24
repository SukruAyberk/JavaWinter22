package day09_ternary_Switch;

public class C03_NestedTernary {

    public static void main(String[] args) {

        // verilen sayının pozitif mi negatif mi olduğunu kontrol edip
        // sıfır veya pozitif sayı ise tek veya çift
        // negatif sayı ise -100'den büyük veya küçük olduğunu belirleyen bir ternary belirleyiniz

        int sayi = -101;

        // Nested if ile
        if (sayi >= 0) {
            if (sayi % 2 == 0) {
                System.out.println("Sayı çift.");
            } else {
                System.out.println("Sayı tek.");
            }
        } else {
            if (sayi > -100) {
                System.out.println("Sayı -100'den büyük.");
            } else {
                System.out.println("Sayı -100'den küçük.");
            }
        }

        //if ternary ile
        if (sayi >= 0) {
            System.out.println(sayi % 2 == 0 ? "Sayı çift" : "Sayı tek");
        } else {
            System.out.println(sayi > -100 ? "Sayı -100'den büyük" : "Sayı -100'den küçük");
        }

        // Nested ternary olarak direkt bu şekilde de yazabiliriz
        String sonuc = sayi >= 0 ? (sayi % 2 == 0 ? "Sayı çift" : "Sayı tek") : (sayi > -100 ? "Sayı -100'den büyük" : "Sayı -100'den küçük");
        System.out.println(sonuc);
    }
}
