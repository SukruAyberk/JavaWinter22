package day43_garbage_abstractClass;

public abstract class C04 {

    /*
    Bir abstract classda abstract veya concrete methodlar bulunabilir
    Child classların abctract methodları override etmesi mecburiyken
    concrete methodların override edilmesi opsiyoneldir
     */

    public abstract void absMethod1();

    public void concreteMethod() {

        System.out.println("C04 concreteMethod");

    }

    public static void concreteStaticMethod() {

        System.out.println("C04 concreteMethod");

    }

    public static void main(String[] args) {

        /*
        Abstract classlar constructor'a sahiptir ancak
        abstract classlardan obje oluşturulamaz CTE verir

        Abstract classlar  OBJE barındırmayan
        sadece cihld classlar için uyulması şart olan veya
        opsiyonel bırakılan özellikleri tanımladığımız bir depo class gibidir
        O yüzden main methoda ihtiyaç yok
         */
        //C04 onj = new C04();
        System.out.println("Bu class abstractttır");
        concreteStaticMethod();
    }
}
