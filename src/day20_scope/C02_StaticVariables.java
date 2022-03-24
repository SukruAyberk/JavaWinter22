package day20_scope;

public class C02_StaticVariables {

    // instance variablelar objeye bağımlıdır ve her obje farklı değerler alabilir
    // öğrenci notları veya öğretmen branşları gibi bir objeye ait variableın son değerini bulmak için
    // o objeyi dikkate alırız

    // static variablelar ise class variable olarak tanımlanır ve tüm class üyeleri için aynıdır.
    // tüm class üyeleri için aynıdır.

    // yani instance'ı öğrenci notu gibi objeye özel durumlarda oluştur diğerleri etkilenmesin
    // ama static variable'ı genel durumlarda oluştur mesela okul ismi
    // okul ismi değişince değişir yani objeye özel bir durum oluşmaz orada

    static String okulIsmi = "Yıldız Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {

        System.out.println(okulIsmi); // Yıldız Koleji
        System.out.println(okulNo); // 0
        System.out.println(okulAcikMi); // false

        okulNo = 102;
        System.out.println(okulNo); // 102

        okulAcikMi = true;
        System.out.println(okulAcikMi); // true

        staticMethod();

        // 200 yazdırır çünkü method içinde değeri 200 yapmıştık en son o değeri alacaktır
        System.out.println(okulNo);


    }

    public static void staticMethod() {

        okulNo = 200;
        System.out.println(okulNo);


    }


}
