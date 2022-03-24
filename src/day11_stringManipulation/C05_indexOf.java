package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {

    public static void main(String[] args) {

        String str1 = "Java bir başka güzel valla çok güzel";

        // istersek char olarak verdiğimiz bir harfin indexini bize döndürür
        System.out.println(str1.indexOf('J')); // 0

        // istersen bir harf ya da metin olarak verdiğimiz String'in indexini döndürür
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.length() - 1);
        System.out.println(str1.indexOf("aşka")); // 10, ilk olarak a'yı gördüğü için onun indexini döndürür

        // aynı harften birden fazla varsa?
        System.out.println(str1.indexOf('b')); // 5, bulduğu ilk doğru eşleşmenin indexini döndürür

        System.out.println(str1.indexOf('b', 5)); // bana b'yi 5'ten sonra bul. 5'ten önce b olsaydı onu saymayacaktı burada 5 dahil

        // verilen String'deki 2. a harfinin indexini bulalım
        int ilkindex = str1.indexOf('a'); // 1
        System.out.println(str1.indexOf('a', ilkindex + 1)); // 1 yazsaydık yine 1 okurdu

        // verilen String'deki 2. b harfinin indexini bulalım
        int ilkindex2 = str1.indexOf('b'); // 1
        System.out.println(str1.indexOf('b', ilkindex2 + 1)); // 1 yazsaydık yine 1 okurdu

        // 20. indexten sonra güzel aratalım
        int güzelindex = str1.indexOf("güzel");
        System.out.println(str1.indexOf("güzel", güzelindex + 1));

        // Stringde olmayan bir harf aratırsak, y yok demesi lazım
        // yok demenin sayısal karşılığı olarak java -1 döndürmeyi tercih etmiştir
        System.out.println(str1.indexOf("y")); // -1

        // kullanıcıdan mail adresi isteyin @ işareti içermiyorsa geçersiz yazdırın
        // içeriyorsa mailiniz kabul edildi yazdırın

        Scanner sscan = new Scanner(System.in);
        System.out.println("Lütfen mail adresiniz giriniz: ");
        String mail = sscan.nextLine();

        if (mail.indexOf("@") == -1) {
            System.out.println("Mailiniz geçersiz.");
        } else {
            System.out.println("Kabul edildi.");
        }

        // ÖZET: indexOf() methodu içerirse yazılan String veya char'ın metinde hangi index'de olduğunu bize döndürür
        // eğer aradığımız metin veya char yoksa, olmadığını göstermek için konsola -1 döndürür

    }
}
