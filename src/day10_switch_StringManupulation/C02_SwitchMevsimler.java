package day10_switch_StringManupulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {

        // kullanıcıdan kaçıncı ay olduğunu alıp mevsimi yazdıran bir switch oluşturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz: ");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 12:
                System.out.println("Kış");
                break;
            case 1:
                System.out.println("Kış");
                break;
            case 2:
                System.out.println("Kış");
                break;
            case 3:
                System.out.println("İlkbahar");
                break;
            case 4:
                System.out.println("İlkbahar");
                break;
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
                System.out.println("Yaz");
                break;
            case 7:
                System.out.println("Yaz");
                break;
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
                System.out.println("Sonbahar");
                break;
            case 10:
                System.out.println("Sonbahar");
                break;
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz.");
        }

        // böyle bir durumda yukardakini yazdırmak yerine daha pratik olabilir aşağıdaki ile yukarıdaki aynı işlevi görecektir

        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz.");
        }

    }
}
