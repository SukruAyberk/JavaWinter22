package day_39overriding;

public class Toyota extends Araba {

    protected String hiz = "Toyota araçlar max 220 km hız yapar";
    protected String marka = "Toyota";
    String sirketMerkezi = "Japonya";

    public void motor() {

        System.out.println("Toyota arabalar Toyota marka motor kullanırlar");

    }

    public void garanti() {
        System.out.println("Toyota araçlar 10 yıl garantilidir");
    }

}
