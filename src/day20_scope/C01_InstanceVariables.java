package day20_scope;

public class C01_InstanceVariables {

    int sayi;
    String bransIsmi = "Java";
    boolean okuldaMi;

    // burada yaptıklarımız static olmayan instance variableları static methodda çalıştırdık
    // normalde static olmayan variablelar static olmayan methodda çalışabilirdi
    // ama biz bu variabllera ulaşmak için obje oluşturduk

    public static void main(String[] args) {

        // sayi = 10; sayi variable'ı static olmadığı için main methoddan direkt kullanılamaz
        // insyance variablelara static methodlardan ulaşabilmek için obje oluşturmamız gerekir

        // SONUNDA!! OBJE OLUŞTURMA!
        C01_InstanceVariables obj1 = new C01_InstanceVariables();
        System.out.println(obj1.sayi); // 0 java başlangıç değerini sıfır atar

        // bu şekilde objenin değerini değiştirebiliriz
        obj1.sayi = 10;
        System.out.println(obj1.sayi); // 10

        System.out.println();

        obj1.bransIsmi = "SQL";
        System.out.println(obj1.bransIsmi); // SQL
        System.out.println(obj1.okuldaMi); // false

        // sıfır yazdırır çünkü obj2 nesnesi obj1 nesnesinden farklı
        // obj1'deki değişiklik obj2'yi ilgilendirmez
        C01_InstanceVariables obj2 = new C01_InstanceVariables();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransIsmi); // Java

        System.out.println();

        obj1.okuldaMi = true;
        System.out.println(obj2.okuldaMi); // false


    }

}
