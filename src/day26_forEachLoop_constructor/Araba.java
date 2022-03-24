package day26_forEachLoop_constructor;

public class Araba {

    /*
    Java'da her class oluşturduğumuzda, Java o class'dan ileride objeler üretmek gerekeceğini bilir
    ve biz özellikle belirtmesek de Java her oluşturduğu class'a bir constructor koyar

    Java'nın class oluştururken class'a koyduğu constructor'a
    DEFAULT CONSTRUCTOR denir ve bu constructor görünmez.

    Eğer biz görünür bir constructor'ımız olsun istersek
    default constructor ile aynı görevi yapan bir constructor oluşturabiliriz
    veya istersek aynı kalıptan farklı desenlerde objeler oluşturmak için
    farklı özelliklerde constructorlar da oluşturabiliriz.

    Constructor'ları birbirinden farklılaştıran tek ayrıcalık
    kullanılan parametre sayısı ve parametre türüdür.

     */

    public Araba() {
        System.out.println("Parametresiz constructor çalıştır");
    }

    // yukarıdaki parametresiz constructor

    /*
    Bir kod bloğunun method veya constructor olmasından emin olmak istiyorsanız
    iki şeye dikkat etmeliyiz;
    1- Constructor'ların ismi, class ismi ile yanı olmak zorunda!
       Yani büyük harfle başlar.
    2- Constructor'ların return type'ı olmaz. Method'dan farkı bu.

    Özetle: Constructor'ın adı class adı ile aynı olmalı ve
            retur type'ı olmamalı.
     */

    public Araba(String renk) {

        System.out.println(renk + " renkli bir araba üretildi.");

    }

    public Araba(int yil) {
        System.out.println(yil + " model bir araba üretildi.");
    }

    public Araba(int yil, String renk) {
        System.out.println(yil + " model bir araba üretildi " + renk + " renginde bir araba üretildi.");
    }


}
