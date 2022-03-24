package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu = true;
       // String str = dogruMu;  sol String sağ boolean olunca kabul etmez

        byte sayi1 = 44;
        System.out.println(sayi1);

        short sayi2 = sayi1;
        System.out.println(sayi2);
        // eşitliğin solu short sağı byte olmasına rağmen java itiraz etmiyor
        // çünkü short içine sayıların konduğu bir data türü
        // byte'da sayıların konulduğu bir data türü
        // bu tipler arasında değer sınırlar dahilindeyse sıkıntı olmaz
        // ama bu olay küçüğü büyüğe yedirirsen olur büyüğü küçüğe yediremezsin

        double sayi3 = sayi1;
        System.out.println(sayi3);
        // bu durumda yukarıdaki tam sayıyı kesirli olarak alır

    }
}
