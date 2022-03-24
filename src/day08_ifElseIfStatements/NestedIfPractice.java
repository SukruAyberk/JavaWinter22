package day08_ifElseIfStatements;

import java.util.Scanner;

public class NestedIfPractice {

    public static void main(String[] args) {

        // Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Şifre: ");
        char password = scan.next().charAt(0);

        if(password == 'A') {
            System.out.println("Geçerli şifre.");
        } else if (password == 'z') {
            System.out.println("Geçerli şifre.");
        } else {
            System.out.println("Geçersiz şifre.");
        }

    }
}
