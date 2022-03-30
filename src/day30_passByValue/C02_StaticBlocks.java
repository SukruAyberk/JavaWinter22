package day30_passByValue;

public class C02_StaticBlocks {

    /*
    static olan bloklar bir kere en başta çalışır

    static olmayan blovklar her obje oluşturulurken yeniden çalışır
    instance variable gibi obje olmadan çalışmaz

     */

    {
        System.out.println("Static olmayan block calisti");
    }

    static {
        System.out.println("Static olan block calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method başı");
        C02_StaticBlocks c1 = new C02_StaticBlocks();
        C02_StaticBlocks c2 = new C02_StaticBlocks();
    }

}
