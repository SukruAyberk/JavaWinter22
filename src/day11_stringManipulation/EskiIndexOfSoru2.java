package day11_stringManipulation;

import java.util.Scanner;

public class EskiIndexOfSoru2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        int ilkIndex = cumle.indexOf(kelime);
        int ikinciIndex = cumle.indexOf(kelime, ilkIndex+1);

        System.out.println(ilkIndex);
        System.out.println(ikinciIndex);

        if(cumle.indexOf(kelime) == -1) {
            System.out.println("Girilen kelime cümlede kullanılmamış");
        } else if (ikinciIndex > ilkIndex) {
            System.out.println("Girilen kelime cümlede birden fazla kullanılmış");
        } else {
            System.out.println("Girilen kelime cümlede bir kere kullanışmış");
        }



    }
}
