package day36_inheritance;

public class Memur extends Muhasebe {

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // Muhasebe class'ından
        Memur memur1 = new Memur();
        memur1.personelNo = 1001;
        memur1.isim = "Ayberk";
        memur1.soyisim = "Gürfidan";
        memur1.adres = "Isparta";
        memur1.tel = "38586351";

        // Muhasebe class'ından
        memur1.saatUcreti = 20;
        memur1.maas = memur1.maasHesapla();
        memur1.statu = "Memur";

        System.out.println(memur1);

        Memur memur2 = new Memur();
        memur2.personelNo = 1002;
        memur2.saatUcreti = 10;
        memur2.maas = memur2.maasHesapla();

        System.out.println(memur2);


    }
}
