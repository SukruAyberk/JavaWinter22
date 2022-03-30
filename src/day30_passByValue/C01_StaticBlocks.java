package day30_passByValue;

public class C01_StaticBlocks {

    // class çalışmaya başlamadan yapmamız gereken ön atamalar varsa onları yapar
    // main methoda ihtiyaç duymaz
    // yerinin önemi yok main method altında olsa bile ilk çalışır
    // static block birden fazla olursa blocklar yukarıdan aşağıya doğru sırayla çalışır
    static {
        System.out.println("static 2 block calisti");
    }
    static {
        System.out.println("static 1 block calisti");
    }

    public C01_StaticBlocks() {
        System.out.println("Constructor çalıştı");
    }

    public static void main(String[] args) {

        System.out.println("main method başlangıcı");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();

    }

}
