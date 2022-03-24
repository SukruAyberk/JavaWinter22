package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C06_MDArrays {

    public static void main(String[] args) {

        // Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle girin: ");
        String cumle = scan.nextLine();

        String[] arr = cumle.split(" "); // boşluktan bölelim ki kelimeleri bulsun

        System.out.println("Girdiğiniz cümledeki kelime sayısı: " + arr.length);

    }
}
