package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {


        String okulIsmi = "MGAL";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf = '$';
        System.out.println(ilkHarf);

        int sayi1 = 1, sayi2=2;
        System.out.println("Toplam: " + (sayi1 + sayi2));

        String isminiz = "Ayberk";
        String soyIsminiz = "Gürfidan";
        System.out.println("İsminiz: " + isminiz + " Soyisminiz: " + soyIsminiz);

        short sayi3 = 20;
        double sayi4 = 30;
        System.out.println("Sayıların toplamı: " + (sayi3 + sayi4));

        char ozelChar = '^';
        System.out.println(ozelChar);

        int sayi5 = 20;
        char harf = 'a';
        System.out.println(sayi5 + harf);
        // char data türündeki değişkenler matematiksel işlemlerde kullanılırsa o char değerinin ASCII karşılığı işleme alınır

        int sayi6 = 'a';
        System.out.println(sayi6);




    }
}
