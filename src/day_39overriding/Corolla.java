package day_39overriding;

public class Corolla extends Toyota {

    String hiz = "Corolla max 200 km hız yapar";
    String yakit = "Arabalar benzinli veya elektriklidir";
    String model = "Corolla";

    public void motor() {

        System.out.println("Corolla araçlar çevreci motor kullanır");

    }

    public void yakitTuketimi() {

        System.out.println("Corolla 5.6L yakıt tüketir");

    }

    public void vitesSayisi() {

        System.out.println("Corolla 5 viteslidir");

    }

    public static void main(String[] args) {

        /*

        Data türü ve constructor farklı olduğunda
        constructor çalıştığı için obje Constructor'ın olduğu
        class özelliklerini taşır ancak data türü Parent class seçildiği için
        variablelar data türünün seçildiği class ve
        onun parent classlarından değer alabilir

        Metholar için ise yine data türünün olduğu class'a gideriz
        ancak direkt methodu çalıştırmadan önce
        method override edilmiş mi diye kontrol ederiz

         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // araba
        System.out.println(arb1.hiz); // Corolla
        System.out.println(arb1.yakit); // Corolla
        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.sirketMerkezi); // Toyota
        System.out.println(arb1.model); // Corolla
        arb1.vitesSayisi(); // Corolla 5 viteslidir

        System.out.println();

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // araba
        System.out.println(arb2.hiz); // Toyota
        System.out.println(arb2.yakit); // Araba
        System.out.println(arb2.marka); // Toyota
        System.out.println(arb2.sirketMerkezi); // Toyota
        //System.out.println(arb2.model); modeli alamaz çümkü toyota veparentında tanımlı değil
        arb2.motor(); // Corolla araçlar çevreci motor kullanır
        arb2.garanti(); // Toyota araçlar 10 yıl garantilidir
        arb2.yakitTuketimi(); // Corolla 5.6L yakıt tüketir
        //arb2.vitesSayisi(); çalışmaz çünkü data türü toyota orada ve parantında vitessayısı methodu yok


        System.out.println();

        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); // araba
        System.out.println(arb3.hiz); // Araba
        System.out.println(arb3.yakit); // Araba
        System.out.println(arb3.marka); // Araba
        //System.out.println(arb3.sirketMerkezi); mensei alamaz çümkü toyota veparentında tanımlı değil
        //System.out.println(arb3.model); modeli alamaz çümkü toyota veparentında tanımlı değil
        arb3.motor(); // Corolla araçlar çevreci motor kullanır OVERRIDE
        arb3.yakitTuketimi(); // Corolla 5.6L yakıt tüketir OVERRIDE

        /*
        arb3 onjesi için motor ve yakitTuketimi methodlarının araba classından almak istedik
        ama o methodlar override edildiği için Corolla classındaki methodlar çalıştı
         */

    }

}
