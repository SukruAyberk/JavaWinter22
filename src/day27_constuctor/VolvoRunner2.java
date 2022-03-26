package day27_constuctor;

public class VolvoRunner2 {

    public static void main(String[] args) {

        // Her obje oluşturduğumuzda model, yakıt gibi değerleri tek tek
        // atama yapmak istemiyorsak;

        Volvo v1 = new Volvo("XC60", false, 2023, "Benzin");
        System.out.println(v1.toString1()); // bunu yapmaya gerek yok aslında
        System.out.println(v1); // yapmamız yeterli toString çalışır bu şekilde

    }
}
