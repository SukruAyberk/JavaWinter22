package day23_multiDimensionalArrays;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle = scan.nextLine();

        String[] arr = cumle.split(" ");

        System.out.println("Girdiğiniz cümlede " + arr.length + " kelime vardır.");

    }
}
