package day36_inheritance;

public class Child extends Parent {

    public Child() {
        // super yazmasak da olur
        System.out.println("Child Constructor calisti");
    }

    // Tüm classlarda biz görmesek bile default cons var
    // Tüm consların ilk satırında biz görmesek bile
    // super() vardır, cons call vardır
    // yani parent classın parametresiz cons call

    public static void main(String[] args) {

        Child c1 = new Child();

    }
}
