package day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
        Java Pass By Value'dur.
        Yani bir primitive variable'ı argument olarak bir methoda yollarsanız
        Java o variable'ı değil, değerini(value) methoda yollar(pass).
         */

        double etkietFiyati = 100;
        yudeOnEtiketFiyati(etkietFiyati);
        yudeOnEtiketFiyati(etkietFiyati);
        System.out.println("İki indirimden sonra main methodda etkiket fiyatı: " + etkietFiyati);
    }

    private static void yudeOnEtiketFiyati(double etkietFiyati) {
        etkietFiyati *= 0.90;
        System.out.println("Sizin için %10 indirimli fiyatımız: " + etkietFiyati);
    }

    // böyle de yapsak java yine etiket fiyatını 100 alır indirim üstüne indirim uygulamaz
    // bu olay Pass By Value
    // Yani Java yudeOnEtiketFiyati(etkietFiyati); kısmında parametre içine variable değil değerini
    // yani 100'ü götürüyor
    // private static void yudeOnEtiketFiyati(double x) {
    //        x *= 0.90;
    //        System.out.println("Sizin için %10 indirimli fiyatımız: " + x);
    //    }

}
