package day09_ternary_Switch;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

        // Ternary ile yapılan tüm işlemler if else ile de yapılabilir.
        // if else yerine ternary tercih etme sebebi yapının basit ve anlaşılabilir olmasıdır.
        // Ternary içerisinde complex kodlar olmaz.
        // Sadece sonuç veya bizi sonuca götüren basit işlemler olabilir.

        // kullanıcıdan bir tam sayı alıp tek mi çift mi yazdıran bir kod yazalım

        // Ternary ile yaparsak
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz.");
        int sayi = scan.nextInt();
        System.out.println(sayi % 2 == 0 ? "Sayı çift" : "Sayı tek");

        // if ile yaparsak

        if (sayi % 2 == 0) {
            System.out.println("Sayı çift.");
        } else {
            System.out.println("Sayı tek.");
        }


    }
}
