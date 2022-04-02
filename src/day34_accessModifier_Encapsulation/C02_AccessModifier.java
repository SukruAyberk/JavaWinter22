package day34_accessModifier_Encapsulation;

public class C02_AccessModifier {

    public static void main(String[] args) {

        C01 obj = new C01();

        obj.acikString = "Bye";
        C01.acikSayi = 50;

        // C01.sayi = 15; private olduğu için başka classtan erişilemez
        // obj.method1; private olduğu için başka classtan erişilemez

        // C01 objParametreli = new C01(5); private olduğu için başka classtan erişilemez

    }
}
