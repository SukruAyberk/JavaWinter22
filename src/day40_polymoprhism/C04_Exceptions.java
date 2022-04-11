package day40_polymoprhism;

public class C04_Exceptions {

    public static void main(String[] args) {

        /*
        String olarak verilen bir sayıyı inte çevirip
        iki katını ekranda yazdır
         */

        String str = "12345";
        /*
        str içinde sayı olmayan bir karakter olursa exception verir
        NumberFormatException
         */
        try {
            int sayi = Integer.parseInt(str);
            System.out.println("Girilen sayının 2 katı = " + sayi * 2);
        } catch (NumberFormatException e) {
            System.out.println("Girdiğiniz string sayı olmayan elementler içeriyor");
        }



    }
}
