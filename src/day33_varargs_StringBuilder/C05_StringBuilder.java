package day33_varargs_StringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("Ali Can");

        String str = "Ali Can";

        /*
         compare çalışma mantığı;
         2 String Builder'ı eşit mi diye kontrol etmek için
         ilk harften başlayarak tüm karakterleri karşılaştırır
         Aynı olan karakterler için bir şey yazdırmaz
         Farklı olan ilk karakter için ascii tablosuna göre
         kaç değer geride veya ileride olduğunu yazdırır

         Tamamen aynı ise 0 yazdırır
         */

        System.out.println(sb1.compareTo(sb2)); //-2

        /*
        Bir sb ile bir Stringi compare edemeyiz
         */

        // 2 farklı obje olarak düşündüğü için false verdi
        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(str)); // false


    }
}
