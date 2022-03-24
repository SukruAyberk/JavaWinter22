package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismnini alıp isminin baş harfini yazdıran algoritma
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");

        //  char'ın nexti olmadığı için string aldık oradan charat getirdik
        char ilkHarf = scan.next().charAt(0);
        System.out.println(ilkHarf);

    }
}
