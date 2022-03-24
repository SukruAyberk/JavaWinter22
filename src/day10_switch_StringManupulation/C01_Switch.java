package day10_switch_StringManupulation;

import java.util.Scanner;

public class C01_Switch {

    public static void main(String[] args) {

        // kullanıcıdan sayı olarak kaçıncı ay olduğunu alıp istenen ay ismini yazdıran bir program yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz: ");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                //break; // bunu yazmamıza gerek yok notmalde çünkü bundan sonra yazdıracağı bir şey yok
            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz."); // buda 1-12 dışında girdiğimiz değerlerde gösterilecek mesaj
        }

        // switch içine yazılan variable'ın değerine göre ilgili case'i bulur
        // eğer break yoksa ilgili case'den sonra sağı doğru bütün case'leri çalıştırır
        // if else'deki son else gibi, geriye kalan tüm durumları tamamen kapsayacak bir satır daha ekleyebiliriz

    }
}
