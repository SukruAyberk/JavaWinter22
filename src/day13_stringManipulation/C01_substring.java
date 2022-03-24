package day13_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        // 5. indexten itibaren yazdıralım
        System.out.println(str.substring(5));

        // yukardaki stringi "Mehmet hoca ile IT çok güzel" yazdıralım
        System.out.println(str.replace("Java", "Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5));

        // IT cok guzel yazdıralım
        System.out.println(str.substring(9));

        // Eğer bir indexten sonra kadar olan parçayı değil belirli bir aralığı almak istersek
        // iki parametre yazmak gerekir str.substring(baslangicIndexi, bitisIndexi);
        // baslangic indexi dahildir ama bitis indexi dahil degildi
        System.out.println(str.substring(0, 5)); // "Java "
        System.out.println(str.substring(0, 1));  // "J"

        //6. harfi string olarak bulmak istiyorsak yine substring
        String harf = str.substring(5, 6);
        System.out.println(harf); // "i"

        str = "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7, 7)); // "" - hiçlik

        // System.out.println(str.substring(5,2)); // hata verir

        // son harfi verdirdik
        System.out.println(str.substring(str.length() - 1));

        //son 5 harfi yazdıralım
        System.out.println(str.substring(str.length()-5));

        // son harften sonraki kısmı yani hiçlik yani "" verir.
        System.out.println(str.substring(str.length()));


    }
}
