package day34_accessModifier_Encapsulation;

public class C01 {

    private static int sayi = 10;
    private static String str = "Java";
    static int acikSayi = 20;
    String acikString = "Hi";
    public static int halkaAcikSayi = 15;
    protected static int aileyeOzel = 40;

    protected C01() {
        // bu cons'un access modifier'ı defaulttur.
        // aynı paketteki classlar erişebilir
        // başka paketteki classlar erişemez
    }

    private C01(int numara) {
        System.out.println("parametreli cons çalıştı");
    }

    private void method1() {


    }
}
