package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {

    public static void main(String[] args) {

        // kullanıcıya derse katılmak isteiyp istemediğini sorun
        // Evet derse, cevabını ve "Derse katılımınız alınmıştır" yazdırın
        // hayır derse cevabını ve "Sornaki derslerimize bekleriz" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz? \nEvet veya hayır yazınız.");
        String cevap = scan.nextLine();

        if(cevap.equalsIgnoreCase("evet")) {
            System.out.println("Cevabınız : " + cevap + " Derse katılımınız onaylanmıştır." );
        } else if(cevap.equalsIgnoreCase("hayır")) {
            System.out.println("Cevabınız : " + cevap + " Derse katılımınız onaylanmıştır." );
        } else {
            System.out.println("Lütfen evet veya hayır yazınız.");
        }

    }
}
