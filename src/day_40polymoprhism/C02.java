package day_40polymoprhism;

public class C02 extends C01 {

    @Override
    protected String method3() {
        return "Java Child";
    }

    @Override
    public void method2() {
        /*
        @Override notasyonu overridden method ile overriding methodu
        birbirine bağlar
        Farkında olunmadan overridden method silinirse veya signature değiştirilirse
        bu ilişki bozulacağı için Java CTE verir

        Notasyon kullanılmazsa Java bunların ilişikini bilir ama
        overridden method silinirse sesini çıkarmaz
         */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {

        C02 obj1 = new C02();
        obj1.method1(); // Parent method1
        obj1.method2(); // Child method2

        C01 obj2 = new C02();
        obj2.method1(); // Parent method1
        obj2.method2(); // Child method2 OVERRIDE!!!!

        C01 obj3 = new C01();
        obj3.method1(); // Parent method1
        obj3.method2(); // Parent method2


    }
}
