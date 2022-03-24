package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1 = 8;
        int sayi2 = 4;
        System.out.println(sayi1/sayi2);

        sayi2 = 3;

        System.out.println(sayi1/sayi2); // çıkması gerekn değer 2.666666

        sayi1 = 22;

        System.out.println(sayi1/sayi2);
        // java iki int sayıyı birbirine bölerse sonuç da int çıkar

        sayi1 = 4895;
        double sayi3 = 10;
        // sayi1 = sayi1 / sayi3; iki farklı sayı data türünü işleme koyduğumuzda
        // java küçük olan data türü için autoWidening yapar
        // bu işlemi düşünürsek sayi1 / sayi3 => işlemin sonucunu double kabul eder
        System.out.println(sayi1 / sayi3);
        System.out.println(sayi3 / sayi1);


    }
}
