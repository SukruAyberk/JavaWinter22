package day07_ifElseStatements;

public class C02_IfStatements {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b && b < 100) {
            System.out.println("isteğiniz gerçekleşecek");
            System.out.println("body içindeki tüm kodlar çalışır");
        }

        if (a < 0)
            System.out.println("Süslü parantez olmazsa sadece bir satır çalışır");


        System.out.println("2. satırda çalışır");

    }
}
