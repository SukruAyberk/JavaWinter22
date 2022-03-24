package day26_forEachLoop_constructor;

public class ArabaRunner {

    public static void main(String[] args) {

        //   Araba      arb1      =     new        Araba();
        // class Adı   obje adı       keyword    constructor
        Araba arb1 = new Araba();

        // String renk constructor'a gidip String olarak mavi yazdıracak
        Araba arb2 = new Araba("mavi");

        // int yil constructor'a gidip int olarak 2022 yazdıracak
        Araba arb3 = new Araba(2022);

        // int yil ve String renk constructor'a gidip int olarak 2022
        // String olarak kırmızı yazdıracak
        Araba arb4 = new Araba(2022, "kırmızı");

        // bu olmaz ama parametreli yeri değişince kabul etmiyor
        // Araba arb5 = new Araba("mavi", 2021);


    }

}
