package day17_forLoop;

import java.util.Scanner;

public class Soru9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime veya cümle gir: ");
        String kelime = scan.nextLine();
        String reverse = "";

        boolean palindromKontrol = plandromKontrolEt(kelime, reverse);

        if (palindromKontrol == true) {
            System.out.println("Palindromik kelime");
        } else {
            System.out.println("Palindromik kelime değil");
        }


    }

    private static boolean plandromKontrolEt(String kelime, String reverse) {
        boolean palindromSonuc = false;

        for (int i = kelime.length() - 1; i >= 0; i--) {
            reverse = reverse + kelime.charAt(i);
        }
        if (reverse.equals(kelime)) {
            palindromSonuc = true;
        } else {
            palindromSonuc = false;
        }
        return palindromSonuc;
    }


}
