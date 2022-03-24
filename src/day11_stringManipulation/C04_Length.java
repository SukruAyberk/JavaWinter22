package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {

    public static void main(String[] args) {

        // kullanıcıdan ismini alıp baş harfini ve son harfini büyük harflerle yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = scan.nextLine();

        System.out.println("İlk Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("Son Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length() - 1));

        System.out.println("-----------------------");

        String str1 = "";
        System.out.println(str1.length()); // 0

        String str2 = null;
        // System.out.println(str2.length()); // null pointer exception

        String str3;
        // System.out.println(str3.length());
        // str3 ve str2'ye değer atanmamıştır
        // str2 null pointer ile işaretlendiğinden java durumun kontrol altında olduğunu bilir ve geriye kalan kodun
        // çalışmasına engel olmaz. Ancak str3'e bir değer ataması olmayınca java altını kırmızı çizer
        // ve bu durum düzeltilinceye kadar kodun geriye kalanının çalışmasına da izin vermez


    }
}
