package day19_doWhileLoop;

import java.util.Scanner;

public class DoWhileSoru6 {

    public static void main(String[] args) {

        //Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar devam
        // istemeyi ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi
        // girildigini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        do {
            System.out.println("Sayi gir: ");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        } while (toplam <= 500);
        System.out.println("Girilen sayı adedi = " + sayac);
        System.out.println("Toplam = " + toplam);

    }
}
