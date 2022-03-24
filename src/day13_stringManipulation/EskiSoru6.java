package day13_stringManipulation;

import java.util.Scanner;

public class EskiSoru6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz.");
        String password = scan.nextLine();

        if (!((password.charAt(0) >= 'A') && (password.charAt(0) <= 'Z'))) {
            System.out.println("İlk harfiniz büyük olmalı!");
        } else if (!(((password.charAt(password.length() - 1)) >= 'a') && (password.charAt(password.length() - 1)) <= 'z')) {
            System.out.println("Son harfiniz küçük olmalı!");
        } else if (password.contains(" ")) {
            System.out.println("Şifrenizde boşluk olmamalı!");
        } else if (password.length() < 8) {
            System.out.println("Şifreniz en az 8 karakter içermeli!");
        } else {
            System.out.println("Şifreniz onaylanmıştır. Şifreniz: " + password);
        }

    }
}
