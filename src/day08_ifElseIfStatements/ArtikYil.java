package day08_ifElseIfStatements;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        int year = scan.nextInt();

        if(year%4==0) {
            if(year%100!=0) {
                if(year%400==0){
                    System.out.println("Artık yıl");
                } else {
                    System.out.println("Artık yıl değildir.");
                }
            } else {
                System.out.println("Artık yıldırr.");
            }
        } else {
            System.out.println("Artık yıl değildir.");
        }

    }
}
