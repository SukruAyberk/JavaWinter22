package day17_forLoop;

import java.util.Scanner;

public class Soru7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime veya cümle gir: ");
        String str = scan.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));
        }

    }

}
