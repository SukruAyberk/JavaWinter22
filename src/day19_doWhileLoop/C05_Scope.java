package day19_doWhileLoop;

public class C05_Scope {

    // 1- Bir method içerisinde oluşturulan variable'lar sadece oluşturuldukları methodda kullanılabilirler.
    //    Başka methodlarda kullanılamazlar.
    // 2- Tüm methodların kullanabilmesini istediğimiz variableları Class level'da oluştururuz.
    //    Class levelda oluşturduğumuz variable'ı 
    //    --static yaparsak tüm methodlar kullanabilir.
    //    --static olmazsa(instance) o zaman sadece static olmayan methodlar kullanabilir.
    // 3- Loop içinde oluşturulan variablela loop içinde kullanılabilir, loop dışında kullanılamaz.

    static String kurs = "Java"; // bütün methodlar buna erişir
    int level = 10; // static olmayan methodlar buna erişir
    static int sayi4;

    public static void main(String[] args) {

        int sayi = 10;
        System.out.println(kurs); // kullanabiliyoruz

        // bunu kabul etmez çünkü levelı biz static olmadan oluşturduk
        // System.out.println(level); 

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loopSayi = 20;
        }

        // i variable'ı loop içinde tanımlanmış bir method o yüzden loop dışında kullanamayız
        // System.out.println(i);

        // loopSayi loop içinde oluşturulduğu için loop dışında kullanılmaz
        // loopSayi = 30;

        // ama main method içinde oluşturup dereğ atamadığım sayi2'yi artırmama java izin vermiyor
        int sayi2;
        // sayi2++;

        // Class seviyesinde oluşturup değer atamadığım sayı 4'ü artırmama java itiraz etmez
        sayi4++;
    }

    public static void methodd1() {
        // kullanamayız çünkü bir methodda oluşturulan variable sadece o methodda geçerlidir.
        // sayi = 20;
        String isim = "Ali Can"; // bunu kullanırız çünkü burda oluşturduk
        System.out.println(kurs); // static olan methodda kullanabiliyoruz

        // bunu kabul etmez çünkü levelı biz static olmadan oluşturduk
        // System.out.println(level); 

    }

    public void method2() {
        // sayi = 30;
        // isim = "Ayse San";
        // kullanamayız çünkü burda oluşturmadık
        System.out.println(kurs); // static olmayanda da kullanabiliyoruz

        // bunu kabul eder levelı static olmadan oluşturduk o yüzden static olmayan method erişebildi
        System.out.println(level);

    }
}
