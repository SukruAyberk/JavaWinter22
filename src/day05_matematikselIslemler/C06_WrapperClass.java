package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        // verilen iki Stringdeki sayıları toplayın

        String str1 = "12345"; //"12345a" yazsaydık kodlamada hata vermez ama kodu çalıştırınca hata verir java kafayı yer
        String str2 = "23456";

        System.out.println(str1 + str2);

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        // bu şekilde String olarak verilen metinsel ifade içindeki sayıları sayısal ifadeye çevirdik
        // Integer.valueOf(str1) methodu sadece sayısal değer içeren Stringlerde kullanılabilir
        // Bir yane bile sayı dışı karakter olursa java hata verir

    }
}
