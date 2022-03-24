package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        // Kullanıcıdan isim soyisim bilgisini alıp bütün harfleri * yapalım

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi ve soyisminizi giriniz: ");
        String nameSurname = scan.nextLine();

        System.out.println(nameSurname.replaceAll("\\S", "*"));

        // \\w kullanarak Ayberk Gürfidan yazarsak çıktı: ****** *ü******
        // \\w kullanarak Ayberk Gurfidan yazarsak çıktı: ****** ********


    }
}
