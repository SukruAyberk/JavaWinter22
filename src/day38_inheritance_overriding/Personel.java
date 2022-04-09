package day38_inheritance_overriding;

public class Personel {

    public String statu = "Personel";
    public String haklar = "Tum personel esit haklara sahiptir";
    public String izin = "Tum personel yılda 4 hafta izin kullanabilir";

    public void mesai() {

        System.out.println("Tüm personel 5 gün, günde 8 saat çalışır");

    }

    public void maasHesapla() {

        System.out.println("Tüm personel 30 gün * 8 saat * 10 euro = " + (30 * 8 * 10) + " Euro maas alır");

    }

}
