package day36_inheritance;

public class UstaBasi extends Isci {

    public static void main(String[] args) {

        UstaBasi usta1 = new UstaBasi();
        usta1.saatUcreti = 15;
        usta1.isim = "Murat";
        usta1.soyisim = "Gökçek";
        usta1.maas = usta1.maasHesapla();
        usta1.statu = "Isci";
        usta1.isciStatu = "Ustabaşı";
        usta1.personelNo = 6001;

        System.out.println(usta1);


    }

    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
