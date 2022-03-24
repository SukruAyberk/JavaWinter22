package day16_methodCreation;

public class C02_Overloading {

    public static void main(String[] args) {

        // verilen iki sayıyı toplayıp yazdıran bir method oluşturalım

        int sayi1 = 10;
        int sayi2 = 20;
        ikiSayininToplami(sayi1, sayi2);

        // iki double sayinin toplamini yazdiran method

        double sayi3 = 15.2;
        double sayi4 = 10.3;
        // kabul etmez çünkü bu methodun parametresi int ama biz double yazmaya çalıştık
        // ama parametre içinde varible'ı cast edersek bu sorun ortadan kalkar ama tabiki yine int toplamı olacak
        // ya da create method diyip iki sayi topla isminde double olarak yeni method oluşturtabiliriz
        // yani aynı isimde iki method olacak birisi int birisi double için çalışacak
        ikiSayininToplami(sayi3, sayi4);

        // eger variable oluşturmadan direkt sayıları yazarak method call yaparsam
        ikiSayininToplami(15, 25); // int olanlar int methoda yönelir
        ikiSayininToplami(10.1, 12.3); // double olanlar double methoda yönelir

        // bir int ile bir double toplamini yazdiran bir method oluşturalim
        int sayi5 = 3;
        double sayi6 = 3.2;
        // kabul eder double methoda yönelir
        // çünkü, java veri kayubını önlemek için kendisi int olanı double yapar
        ikiSayininToplami(sayi5, sayi6);
        // ama aynı methodu tekrar overload edip birini int birini double yaparsak int ve double olan method çalışır


    }

    private static void ikiSayininToplami(int sayi3, double sayi4) {
        double toplam = sayi3 + sayi4;
        System.out.println("Bir int bir double toplami = " + toplam);
    }

    // bunu kabul eder çünkü int double ile double int aynı şey değildir
    private static void ikiSayininToplami(double sayi3, int sayi4) {
        double toplam = sayi3 + sayi4;
        System.out.println("Bir int bir double toplami = " + toplam);
    }

    private static void ikiSayininToplami(double sayi3, double sayi4) {
        double toplam = sayi3 + sayi4;
        System.out.println("İki sayinin double toplami = " + toplam);
    }

    private static void ikiSayininToplami(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println("İki sayinin int toplami = " + toplam);
    }
    // bunu da kabul etmez signature yukardaki methodla aynı yani int, int
    // sayi1 yerine sayi11 yazman bir şey ifade etmez
    //private static void ikiSayininToplami(int sayi11, int sayi12) {
    //  System.out.println("İki sayinin int toplami = " + (sayi11 + sayi12));
    //}
}
