package day_39overriding;

public class Araba {

    String hareket = "Arabalar teker ile hareket eder.";
    String hiz = "Arabalar motor gücüne göre hız yapar";
    String yakit = "Arabalar farkli yakitlar kullanirlar";
    String marka = "Arabalar üretildikleri markaya sahiptir";

    public void motor() {

        System.out.println("Arabalar farklı markalardan motor kullanırlar");

    }

    public void yakitTuketimi() {

        System.out.println("Arabalar motor gücü ve yakıt türüne göre yakıt tüketirler");

    }

}
