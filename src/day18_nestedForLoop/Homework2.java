package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasında bir sayı tuttur
        // kullanıcıdan bu sayıyı 3 seferde tahmin etmesini iste
        // girilen her tahminde sayıyı büyült veya küçült şeklinde feedback verdir
        // kullanıcı sayıyı bulduğunda kaç tahminde sayıyı bulduğunu kullanıcıya yazdır

        System.out.println("Sayı tahmin oyununa hoşgeldiniz.");
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int randomSayi = rnd.nextInt(101);
        int tahmin = 0;
        int tahminHakki = 3;
        int tahminAdedi = 0;

        tahminMethodu(scan, tahmin, tahminAdedi, tahminHakki, randomSayi);


    }

    private static void tahminMethodu(Scanner scan, int tahmin, int tahminAdedi, int tahminHakki, int randomSayi) {

        while (tahmin != randomSayi) {
            System.out.print("Lütfen 1 - 100 arasında bir sayı tahmin edin: ");
            tahmin = scan.nextInt();


            if (tahminHakki != 1) {


                if (tahmin < randomSayi) {
                    if (randomSayi - tahmin < 10) {
                        tahminHakki--;
                        System.out.println(tahminHakki + " tahmin hakkınız kaldı");
                        System.out.println("Çok az kaldı lütfen tahmininizi büyültün.");
                    } else {
                        tahminHakki--;
                        System.out.println(tahminHakki + " tahmin hakkınız kaldı");
                        System.out.println("Tahminden çok uzaksın lütfen tahmini büyültün.");
                    }
                } else if (tahmin > randomSayi) {
                    if (tahmin - randomSayi < 10) {
                        tahminHakki--;
                        System.out.println(tahminHakki + " tahmin hakkınız kaldı");
                        System.out.println("Çok az kaldı lütfen tahmininizi küçültün.");
                    } else {
                        tahminHakki--;
                        System.out.println(tahminHakki + " tahmin hakkınız kaldı");
                        System.out.println("Tahminden çok uzaksın lütfen tahmini küçültün.");
                    }
                } else {
                    System.out.println("Tebrikler. " + randomSayi + " sayısını doğru tahmin ettiniz");
                    break;
                }


            } else {
                System.out.println("Hakkınız bitmiştir. Sayıyı bulamadınız. Doğru sayı = " + randomSayi + " idi.");
                break;
            }


        }


    }
}
