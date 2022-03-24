package day05_matematikselIslemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {

        // non primiteve data türleri data depolamanın yanında birçok faydalı methoda sahiptir.
        // ancak primitive data türlerinin böyle bir özelliği yoktur.
        // primitive data türleri sadece değerleri saklarlar.

        // java, primitive data türleri için de bazı methodlar gerekli olduğu zaman ara çözüm üretmiştir
        // java her bir primitive data türünü, non primitive olarak kuıllanabilmek için özel classlar oluşturmuştur
        // bunlara wrapper class denir.


        String str = "Ayberk";
        int sayi = 10;

        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str);

        double sayi2 = 20.5;
        // sayi2 primitive olduğundan sayi2. dediğimizde method gelmez

        Double sayi3 = 15.2;
        // sayi3 wrapper class olan Double classını kullandığından sayi3. dediğimizde methodlar gelir


    }
}
