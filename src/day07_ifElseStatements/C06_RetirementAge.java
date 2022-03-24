package day07_ifElseStatements;

import java.util.Scanner;

public class C06_RetirementAge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");

        int age = scan.nextInt();

        if (age >= 65) {
            System.out.println("Yaşınız: " + age);
            System.out.println("Emekli olabilirsiniz.");
        } else if (age <= 0) {
            System.out.println("Lütfen pozitif bir değer giriniz.");
        } else if (age < 18) {
            System.out.println("Lütfen mantıklı bir değer giriniz.");

        } else {
            System.out.println("Yaşınız: " + age);
            System.out.println("Emeklilik yaşı 65'tir." + (65 - age) + " sene çalışmalısınız.");
        }

    }
}
