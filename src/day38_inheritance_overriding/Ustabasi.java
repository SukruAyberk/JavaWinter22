package day38_inheritance_overriding;

public class Ustabasi extends Isci {

    public String statu = "Ustabaşı";
    public String haklar = "Ustabaşı haftada 1 gün ekstra tatil hakkına sahiptir";

    public void mesai() {

        System.out.println("Arıza varsa ustabaşı ekstra ücret almadan çalışır");

    }

    public void maasHesapla() {

        System.out.println("Ustabaşı 30 gün * 8 saat * 11 euro = " + (30 * 8 * 12) + " Euro maas alır");

    }

    public static void main(String[] args) {

        /*
    Ustabaşı hem işçi hem personel
    Sadece ustabaşına zam yapmak için overriding yapmamız lazım

    İçinde olduğumuz classdan klasik haliyle bir obje oluşturursak
    o obje ile çağırdığımız variable ve methodlarda
    Java önce içindeki bulunduğumuz class'a bakar
    Aradığımız class üyesi, içinde olduğumuz classda varsa
    bize onu getirir.
    Yoksa, parent classlara bakar ilk bulduğunu getirir
    Parentta varsa grandparent'a gitmez
    Parentta yoksa grandparent'a gider.
     */

        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.statu); // Ustabaşı
        System.out.println(yasin.haklar); // Ustabaşı haftada 1 gün ekstra tatil hakkına sahiptir
        System.out.println(yasin.ikramiye); // İşçiler yılda bir ikramiye alır
        System.out.println(yasin.izin); // Tum personel yılda 4 hafta izin kullanabilir
        yasin.maasHesapla(); // Ustabaşı 30 gün * 8 saat * 11 euro = 2880 Euro maas alır
        yasin.mesai(); // Arıza varsa ustabaşı ekstra ücret almadan çalışır

        System.out.println();

        /*
        Eğer işçi olarak özelliklerini görmek istersek
        Class adını (Data türünü) Isci seçeriz
         */
        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.statu); // İşçi
        System.out.println(ahmet.haklar); // Tum işçiler esit haklara sahiptir
        System.out.println(ahmet.ikramiye);// İşçiler yılda bir ikramiye alır
        System.out.println(ahmet.izin); // Tum personel yılda 4 hafta izin kullanabilir
        ahmet.maasHesapla(); // Ustabaşı 30 gün * 8 saat * 11 euro = 2880 Euro maas alır
        ahmet.mesai(); // Arıza varsa ustabaşı ekstra ücret almadan çalışır

        System.out.println();

        Personel adem = new Ustabasi();
        System.out.println(adem.statu); // Personel
        System.out.println(adem.haklar); // Tum personel esit haklara sahiptir
        // System.out.println(adem.ikramiye);//CTE verir çünkü personelin atasında ikramiye yok ki zaten atası yok
        System.out.println(adem.izin); // Tum personel yılda 4 hafta izin kullanabilir
        adem.maasHesapla(); // Ustabaşı 30 gün * 8 saat * 11 euro = 2880 Euro maas alır
        adem.mesai(); // Arıza varsa ustabaşı ekstra ücret almadan çalışır

        /*
        Personel adem = new Ustabasi(); Ustabasi objesi
        Personel adem = new Personel(); Personel objesi
         */

        /*
        Personel adem = new Ustabasi();
        Bir assignment varsa sol data türü, variable ismi ve sağ ise değerdir

        Ademin data türü personeldir
        Böylece biz ademi ne olarak isimlendirdiğimizi bilebiliriz
        Ancak ben ademin ustabaşı olduğunu biliyorum
        çünkü constructor'ı ustabaşı
        Ama bu yazı formatı ile ademin tüm personel ile birlikte sahip olduğu
        ortak özellikleri vurgulamak istiyorum

        Bu kullanım şeklinde oluşturulan obje data türü olarak seçilen class
        ve onun parent classlarındaki variableları kullanabilir
         */

    }

}
