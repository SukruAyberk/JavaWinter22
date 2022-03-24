package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {

    public static void main(String[] args) {

        // kullanıcıdan iki sayı isteyin
        // sayıların ikisi de pozitif ise sayıların toplamını yazdırsın
        // sayıların ikiside negatif ise satıların çarpımını yazdırsın
        // ikisi farklı işaretlere sahipse farklı işaretlerde sayılarda işlem yapamazsın yazdırsın
        // sayıladan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elemandır yazsın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz: ");
        double sayi1 = scan.nextDouble();

        System.out.println("Lütfen birinci sayıyı giriniz: ");
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(sayi1 * sayi2);
        } else if (sayi1 * sayi2 < 0) {
            System.out.println("farklı işaretlerde sayılarda işlem yapamazsın");
        } else {
            System.out.println("sıfır çarpmaya göre yutan elemandır");
        }

        // son ihtimali yazmadık ama else dediğimiz de kalan durumları söyleyecek kalan durum da sıfır olduğu için bir sıkıntı olmadı
        // o yüzden sıfır ihtimali için else if yapmaya gerek yok

    }
}
