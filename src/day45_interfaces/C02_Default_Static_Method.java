package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static {

    /*
    Bir interfacede default veya static olarak tanımlanan methodların
    override edilmesi mecburid eil çünkü abstract değiller

    Eğer static olarak tanımlanmışsa zaten override edemeyiz
     */

    @Override
    public void method1() {
        System.out.println("Child class method1");
    }

    /*
    Parent Interfacedeki default olarak tanımlanan methodu
    istersek override ederiz istersek etmeyiz
    override etmezsek, method çağırıldığında Parent Interfcadeki çalışır
    Override edersek, method çağırıldığında child class çalışır
     */

    public static void main(String[] args) {
        /*
        Interfacede static olarak tanımlanan methoda direkt ulaşılabilir
        (Interfaceismi.methodismi)
         */
        I01_Default_Static.method3();

        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method2(); // Child class
        obj.method1(); // Parent Interface
        /*
        obj.method3(); eski classlarda static üyeye
        static olmayan yollarla da ulaşabilirdik
        ancak interface içerisinde static olarak tanımlanan methoda
        static olmayan yöntemlerle ulaşılamaz
         */


    }

}
