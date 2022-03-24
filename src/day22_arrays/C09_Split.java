package day22_arrays;

import java.util.Scanner;

public class C09_Split {
    public static void main(String[] args) {

        // ÖDEV - Verilen bir cümlede istenen harfin kaç defa kullanıldığını yazdıran bir method oluşturun
        // "Nerede o 'hello world' yazdiramayan ogrenciler?" "e"
        // char ile

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle girin: ");
        String cumle = scan.nextLine();
        System.out.print("Bulmak istediğiniz karakteri girin: ");
        char harf = scan.nextLine().charAt(0);

        harfKacKereKullanilmis(cumle, harf);


    }

    private static void harfKacKereKullanilmis(String cumle, char harf) {
        int sayac = 0;
        String harfStr = "" + harf;
        String[] karakterler = cumle.split("");

        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harfStr)) {
                sayac++;
            }
        }
        System.out.println(harfStr + " karakteri cümlede " + sayac + " kere geçiyor");

    }
}
