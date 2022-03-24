package day22_arrays;

import java.util.Scanner;

public class C08_Split {

    public static void main(String[] args) {

        // ÖDEV - Verilen bir cümlede istenen harfin kaç defa kullanıldığını yazdıran bir method oluşturun
        // "Nerede o 'hello world' yazdiramayan ogrenciler?" "e"
        // String ile

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle girin: ");
        String cumle = scan.nextLine();
        System.out.print("Bulmak istediğiniz kelimeyi girin: ");
        String harf = scan.nextLine();

        harfKacKereKullanilmis(cumle, harf);


    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {
        int sayac = 0;
        String[] karakterler = cumle.split("");

        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)) {
                sayac++;
            }
        }
        System.out.println(harf + " harfi cümlede " + sayac + " kere geçiyor");

    }
}
