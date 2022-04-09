package day38_inheritance_overriding;

public class Isci extends Personel {

    public String statu = "İşçi";
    public String haklar = "Tum işçiler esit haklara sahiptir";
    public String ikramiye = "İşçiler yılda bir ikramiye alır";

    public void mesai() {

        System.out.println("Tüm işçiler haftalık 40 saat çalışır");

    }

    public void maasHesapla() {

        System.out.println("Tüm işçiler 30 gün * 8 saat * 11 euro = " + (30 * 8 * 11) + " Euro maas alır");

    }

}
