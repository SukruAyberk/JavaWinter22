package day45_interfaces;

public interface I01_Default_Static {
    /*
    Interfacelerde sadece abstract methodlar bulunur
    body'si olan concrete bir method oluşturmak istediğimizde
    Java CTE verir

    ANcak Java 8 ve üzeri versiyonlarda istisnai olarak
    static veya default olarak tanımlanan methodların body'si olabilir
    Ancak burada kullanılan default keyword'ü access modifier değildir.
    Çünkü interfacelerde tüm methodlar public ve abstarcttır

    Aşağıdaki örnekte görüleceği gibi default olarak tanımlanmış bir methoda
    access modifier olarak public yazabilirsiniz
    (access modifier yazmasakta Java methodu public olarak kabul edecektir)
    */

    void method1();

    public default void method2() {
        System.out.println("Interface'deki default method");
    }

    static void method3() {
        System.out.println("Interface'deki static method");
    }


}
