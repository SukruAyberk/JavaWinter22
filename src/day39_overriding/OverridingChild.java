package day39_overriding;

public class OverridingChild extends OverridingParents {

    public void method1() {
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
        Bir obje oluşturulurken data türü veconstructor aynı classsdan seçilmişse
        Java direkt o classa gider hem variable hem de method için
        o classda varsa kullanır, yoksa o classın
        parentlarına bakar
         */

        OverridingChild obj1 = new OverridingChild();
        obj1.method1(); // Child class method1
        obj1.method2(); // Parent class method2

        System.out.println();


        OverridingParents obj3 = new OverridingParents();
        obj3.method2(); // Parent class method2
        obj3.method1(); // Parent class method1 ama child olması lazım?

        System.out.println();

        /*
        Eğer Data türü parent, Constructor child classtan seçildiyse
        Variablelarda yukarıdaki şekilde çalışma devam eder
        Ancak methodlar için data türünün olduğu classdaki method
        Child class tarafından OVERRIDE edilmiş mi diye kontrol etmemiz gerekir
        Eğer child classlarda vu method override edilmişse
        Override eden method çalışır
         */

        OverridingParents obj2 = new OverridingChild();
        obj2.method2(); // Parent class method2
        obj2.method1(); // Child class method1


    }

}
