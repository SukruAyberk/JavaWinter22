package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {

    public static void main(String[] args) {

        // girdiğimiz notun harf değerini göstersin
        // 50'den küçükse D
        // 56-60 C
        // 60-80 B
        // 80-100 A

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen notunuzu giriniz: ");
        double not = scan.nextDouble();

        // if (not < 0 || not > 100) {
        //   System.out.println("0-100 arası not girmelisiniz.");
        //} else if (not < 50) {
        //  System.out.println("Harf notunuz D.");
        //} else if (not >= 50 && not < 60) {
        //  System.out.println("Harf notunuz C.");
        //} else if (not >= 60 && not < 80) {
        //  System.out.println("Harf notunuz B.");
        //} else {
        //  System.out.println("Notunuz A");
        //}
        // üst kısım gereksiz derlenmiş hali altta

        if (not < 0 || not > 100) {
            System.out.println("0-100 arası not girmelisiniz.");
        } else if (not < 50) {
            System.out.println("Harf notunuz D.");
        } else if (not < 60) {
            System.out.println("Harf notunuz C.");
        } else if (not < 80) {
            System.out.println("Harf notunuz B.");
        } else {
            System.out.println("Notunuz A");
        }

    }
}
