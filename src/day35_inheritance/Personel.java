package day35_inheritance;

public class Personel {

    protected String name;
    protected String surname;
    protected String adres;

    @Override
    public String toString() {
        return "Personel{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
