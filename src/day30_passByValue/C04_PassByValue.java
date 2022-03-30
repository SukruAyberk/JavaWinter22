package day30_passByValue;

public class C04_PassByValue {

    // eğer bir methodda yapılan değişikliğin kalıcı olmasını istiyorsak
    // iki yöntem kullanabiliriz
    // 1- variable'ı class levelda static olarak oluşturmak

    static double etkietFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {

        etkietFiyati = 100;
        indirimYuzdesi = 10;
        kaliciIndirimYap();
        indirimYuzdesi = 15;
        kaliciIndirimYap();
        indirimYuzdesi = 5;
        kaliciIndirimYap();

    }

    public static void kaliciIndirimYap() {

        // variablelar zaten statiz o yüzden method parametresine yazmadık
        // class levelda değer değiştiği için kalıcı oldu
        // Ama sıkıtı şu ki ardarda indirim yaparsan hep fiyat son değerden indirime girecek
        etkietFiyati = etkietFiyati * (100 - indirimYuzdesi) / 100;
        System.out.println("İndirimli fiyat: " + etkietFiyati);

    }


}
