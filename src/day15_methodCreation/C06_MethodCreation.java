package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {
        int a = 10, b = 20;

        // iki variable'in degerlerini toplayan bir method olustur

        // 1- method ismini yaz
        // 2- method icine gerekli variable'lari yaz
        // 3- methodu create et ve icini doldur
        // 4- calistir
        // Method ancak cağırılırsa çalışabilir
        ikiSayiTopla(a, b);

        // methodu yazarak oluşturmak yerine ismini yazarak çağırabiliriz de
        // hatta içince variable yazmak yerine sabit değişkenler yazıp toplanmasını sağlayabiliriz
        // aynı veya farklı classta olmasının giçbir önemi yok
        // Java main methodda yukarıdan aşağıya doğru çalışır ve geldiği satırı çalıştırır
        ikiSayiTopla(25, 50);
        C04.dortHarfiTersineCevir("sema");
    }

    private static void ikiSayiTopla(int a, int b) {
        int toplam = a + b;
        System.out.println("Verilen iki sayinin toplami: " + toplam);
    }

}
