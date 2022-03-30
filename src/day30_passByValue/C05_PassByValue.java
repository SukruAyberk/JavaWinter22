package day30_passByValue;

public class C05_PassByValue {

    // kalıcı indirim için ikinci yöntem atama yapmak

    public static void main(String[] args) {

        double etkietFiyati = 100;
        double indirimYuzdesi = 10;

        etkietFiyati = kaliciIndirimYap(etkietFiyati, indirimYuzdesi);
        System.out.println("Main methodda indirim sonrası etiket fiyatı: " + etkietFiyati);


    }

    private static double kaliciIndirimYap(double etkietFiyati, double indirimYuzdesi) {

        etkietFiyati = etkietFiyati * (100 - indirimYuzdesi) / 100;
        System.out.println("İndirimli fiyat: " + etkietFiyati);

        return etkietFiyati;
    }


}
