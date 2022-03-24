package day09_ternary_Switch;

public class C02_Ternary {

    public static void main(String[] args) {

        // verilen sayının üç veya daha çok basamaklı olup olmadığını kontrol eden ve sonucu yazdıran bir ternary oluştur
        int sayi = 1400;

        // sayi >= 100 ? "Sayı 3 veya daha çok basamaklı" : "Sayı negatif veya 3 basamaktan küçük";  ternary sonuç içerdiği için bunu bu şekilde yazamayız sput içine yazabiliriz
        System.out.println(sayi >= 100 ? "Sayı 3 veya daha çok basamaklı" : "Sayı negatif veya 3 basamaktan küçük");

        // ternary bize sonuç döndürdüğü için ya bu sonucu direkt yazdırmalıyız
        // ya da sonucun data türüne uygun bir variable'a atama yapabiliriz yani;

        String sonuc = sayi > 99 ? "Sayı 3 veya daha çok basamaklı" : "Sayı negatif veya 3 basamaktan küçük";
        System.out.println(sonuc);

    }
}
