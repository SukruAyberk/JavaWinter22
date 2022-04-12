package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {

    public static void main(String[] args) {

        /*
        Kullanıcıdan yaşını iste
        Kullanıcı yaş olarak negatif bir sayı, 0 veya 120'den büyük bir sayı girerse
        illegalArgumentException oluşacak şekilde bir program yaz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşını gir: ");
        int yas = scan.nextInt();
        if (yas <= 0 || yas > 120) {
            // System.out.println("Geçerli bir yaş gir!");
            // Java bizim istediğimiz durumlarda exception fırlatabilir
            throw new IllegalArgumentException();
        } else {
            System.out.println("Yaşınız onaylandı " + yas);
        }

    }
}
