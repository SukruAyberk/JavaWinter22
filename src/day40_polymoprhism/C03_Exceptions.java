package day40_polymoprhism;

import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        /*
         Kullanıcıdan iki sayı alıp bölerek
         sonucu yazdıran bir code yaz
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Bölmek istediğiniz sayıyı yazınız: ");
        int sayi1 = scan.nextInt();

        System.out.print("Kaça bölmek istediğinizi yazınız: ");
        int sayi2 = scan.nextInt();

        /*
        Sayi2 0 olduğunda sayi1 / 0 yanımsız olacağından
        Java bu duruma exception verir
        Javanın yazdığı mesajda exceptin ne tür bir soru olduğu
        neden kaynaklandığı ve hangi satırda oluştuğu yazar.

        Bu sorun if ilede çözülebilir try catch ilede çözülebilir

        "Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at day_40polymoprhism.C03_Exceptions.main(C03_Exceptions.java:26)"
         */

        if (sayi2 == 0) {
            System.out.println("Sayi / 0 tanımsızdır.");
        } else {
            System.out.println("Sonuç = " + (sayi1 / sayi2));
        }

        /*
        Ama bu yöntem her sorunda çalışmaz o yüzden try catch yapacağız 4. classta
         */


    }

}
