package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_RetirementAgeKadinErkek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen cinsiyetinizi girin. " + "\nKadın için K\nErkek için E'ye basınız: ");
        char gender = scan.next().toUpperCase().charAt(0);

        System.out.print("Lütfen yaşınızı giriniz: ");
        double age = scan.nextDouble();

        if (gender == 'K') {
            if (age <= 0 || age > 120) {
                System.out.println("Lütfen giridğiniz yaş değerini kontrol edin.");
            } else if (age < 60){
                System.out.println("Emeklilik yaşınız dolmadı. Emekleniz olmanız içi gereken süre: " + (60 - age) + " yıldır.");
            } else {
                System.out.println("Tebrikler, emekli olabilirsiniz.");
            }
        } else if (gender == 'E') {
            if (age <= 0 || age > 120) {
                System.out.println("Lütfen giridğiniz yaş değerini kontrol edin.");
            } else if(age < 65){
                System.out.println("Emeklilik yaşınız dolmadı. Emekleniz olmanız içi gereken süre: " + (65 - age) + " yıldır.");
            } else {
                System.out.println("Tebrikler, emekli olabilirsiniz.");
            }
        } else {
            System.out.println("Lütfen cinsiyet için geçerli bir harf girin.");

        }

    }
}
