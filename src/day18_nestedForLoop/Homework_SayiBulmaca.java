package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class Homework_SayiBulmaca {

    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasında bir sayı tuttur
        // kullanıcıdan bu sayıyı tahmin etmesini iste
        // girilen her tahminde sayıyı büyült veya küçült şeklinde feedback verdir
        // kullanıcı sayıyı bulduğunda kaç tahminde sayıyı bulduğunu kullanıcıya yazdır


        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomSayi = rand.nextInt(101);
        System.out.println("$Sayı Tahmin Oyunu$");
        int tahminAdedi = 0;
        int tahmin = 0;

        sayiTahminEdenMethod(randomSayi, tahmin, tahminAdedi, scan);

    }

    private static void sayiTahminEdenMethod(int randomSayi, int tahmin, int tahminAdedi, Scanner scan) {

        while (tahmin != randomSayi) {
            System.out.println(randomSayi);
            System.out.print("Lütfen 1-100 arasında bir tahminde bulunun: ");
            tahmin = scan.nextInt();

            if (tahmin < randomSayi) {
                if (randomSayi - tahmin <= 10) {
                    System.out.println("Çok az kaldı tahmininizi çok az büyütün.");
                } else {
                    System.out.println("Tahmininiz çok uzak lütfen tahmini büyütün");
                }
            } else if (tahmin > randomSayi) {
                if (tahmin - randomSayi <= 10) {
                    System.out.println("Çok az kaldı tahmininizi çok az azaltın.");
                } else {
                    System.out.println("Tahmininiz çok uzak lütfen tahmini küçültün");
                }
            }
            tahminAdedi++;

        }
        System.out.println("Tebrikler. " + randomSayi + " sayısını " + tahminAdedi + ". tahminde buldunuz.");

    }
}
