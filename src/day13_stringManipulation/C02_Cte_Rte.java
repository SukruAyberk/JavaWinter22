package day13_stringManipulation;

public class C02_Cte_Rte {

    public static void main(String[] args) {

        String str = "Javada hersey zamanla oturur";

        // hata verir. Cunku karakter uzunluğumuz 28 ama biz o sınırların dışından devam ettirmek istedik
        System.out.println(str.substring(5000));

    }
}
