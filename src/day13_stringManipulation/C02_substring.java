package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuç sayısı 100'den çok ise super
        // az ise "az sonuç bulundu"

        String str = "1-48 of 7000 results for \"java\"";

        // 104'ü alalım

        int ilkSpace = str.indexOf(" ");
        int ikinciSpace = str.indexOf(" ", ilkSpace + 1);
        int ucuncuSpace = str.indexOf(" ", ikinciSpace + 1);
        String aramaSonucSayisiStr = str.substring(ikinciSpace + 1, ucuncuSpace);
        System.out.println(aramaSonucSayisiStr); // " 104"

        // şimdide String 7000'i int 7000 yapalım
        int aramaSonucSayisiInt = Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt > 100) {
            System.out.println("Süper.");
        } else {
            System.out.println("Az sonuç bulundu");
        }

    }
}
