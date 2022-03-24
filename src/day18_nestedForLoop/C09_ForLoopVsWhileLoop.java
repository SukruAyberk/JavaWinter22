package day18_nestedForLoop;

import java.util.Scanner;

public class C09_ForLoopVsWhileLoop {

    public static void main(String[] args) {

        // kullanıcıdan toplamk istediği sayıları al ve kullanıcı sıfıra basıncaya kadar devam et
        // kullanıcı sıfıra bastığında döngüden çık ve girdiği sayıların toplamını yazdır

        // for loop ile
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        // bu durumu for ile yapmak çok zor sınır belirleyemiyoruz çünkü kaç sdayı gireceği belli dğeil
        // o yüzden 10000000 yazdık şimdilik
        for (int i = 1; i <= 10000000; i++) {
            System.out.print("Lütfen bir sayı gir: ");
            sayi = scan.nextInt();

            if (sayi == 0) {
                break;
            } else {
                toplam = toplam + sayi;
            }
        }

        System.out.println("Girdiğiniz sayıların toplamı = " + toplam);

        System.out.println("-----------------------------------");

        // while ile
        // sayi ve toplamı sıfırladık
        // sayıya sıfır verirsek kod ölü doğar çünkü sayı sıfıra eşit olmadığı sürece while içinde işlem yaptırıcaz
        // sayının ilk değeri önemli değil zaten kendim giricem o yüzden başlangıç değeri olarak istediğimi yazarım ben 1 yazdım
        sayi = 1;
        toplam = 0;

        // while bir koşula bağlamak lazım içi true ise işlemi yapmaya devam eder
        // false ise döngü kırılır
        // buradaki şartımız girilen sayının sıfır olup olmaması
        // girilen sayı sıfır olmadığı sürece loop'u devam ettir dedik
        // sıfır ise döngüden çıkacak
        while (sayi != 0) {
            System.out.print("Lütfen bir sayı girin: ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Girdiğiniz sayıların toplamı = " + toplam);

        // başlangıç, bitiş ve değişim değerleri net olan durumlarda for loop daha avantajlı
        // ama adım sayısı yani bitişi belli olmayan durumlarda while loop daha avantajlı


    }
}
