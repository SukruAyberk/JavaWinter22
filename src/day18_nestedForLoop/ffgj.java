package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class ffgj {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int rand = 5;
        int num = 0;
        int tahmin = 0;
        while (num != rand) {
            System.out.println("1-100 arasindaki tahmininizi giriniz");
            num = scan.nextInt();
            //System.out.println(rand); kopya çekmek isteyenler için
            tahmin++;
            if (3 - tahmin != 0) {
                System.out.println((3 - tahmin) + " " + "tahmin hakkiniz kaldi");
            } else {
                System.out.println("hakkınız bitmistir");
                break;
            }
            if (num < rand) {
                System.out.println("sayiyi büyüt");
                //continue;
            } else if (num > rand) {
                System.out.println("sayiyi kücült");
                //continue;
            } else {
                System.out.println("aferin köfte ");
            }
            System.out.println("tahmin=" + tahmin);
        }

    }

}
