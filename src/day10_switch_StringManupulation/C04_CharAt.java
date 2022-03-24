package day10_switch_StringManupulation;

public class C04_CharAt {

    public static void main(String[] args) {

        String str = "Java çok güzel";

        // J'yi yazdıralım
        System.out.println(str.charAt(0));

        // G'yi yazdır
        System.out.println(str.charAt(9));

        // va yazdır
        System.out.println("" + str.charAt(2) + str.charAt(3)); // araya "" koymazsak ascii değerini alır

        // çOK yazdır
        System.out.println("" + str.charAt(5) + str.toUpperCase().charAt(6) + str.toUpperCase().charAt(7));

        // son karakteri yazdır
        // Stringde 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1)); // 14-1 ya da 13 yazılabilir

    }
}
