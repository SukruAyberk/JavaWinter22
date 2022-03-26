package day28_constructor;

public class StaticKeyword {

    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        // static variable olduğu için obje oluşturmaya gerek yok
        System.out.println("Sayı1: " + sayi1); // 0


        // static olmadığı için obje oluşturmak gerekti
        StaticKeyword s = new StaticKeyword();
        System.out.println("Sayı2: " + s.sayi2); // 0

        sayi1++;
        s.sayi2++;
        System.out.println("Sayı1: " + sayi1); // 1
        System.out.println("Sayı2: " + s.sayi2); // 1
        System.out.println(s.sayi1); // 1 sayı1'i obje üzerinden de yazdırabiliriz

        StaticKeyword s2 = new StaticKeyword();
        System.out.println(s2.sayi2); // 0
        System.out.println(sayi1); // 1

        s2.sayi1++;
        s2.sayi2++;

        System.out.println(s2.sayi2); // 1
        System.out.println(s2.sayi1); // 2

        // ÖZET: Static variable class'a bağımlıdır.
        // Staticte yaptığım değişiklik daima kalıcı olur.
        // Üçüncü bir obje üretsem bile değer kaldığı yerden artmaya devam eder.
        // Ama instance variable objeye bağımlıdır.
        // Sadece obje üzerinden erişilebilir. Durum böyle olduğu için
        // Birinci objenin değeri ikiyi etkilemez


    }

}
