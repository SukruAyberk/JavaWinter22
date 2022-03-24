package day12_stringManipulation;

public class C05_replace {

    public static void main(String[] args) {

        String str = "Bugün ne çok şey öğrendik";

        // bu cümlede boşluk dışındaki karakter sayısı nedir?
        System.out.println("Space hariç karakter sayısı: " + str.replace(" ", "").length());

        // atama yapılmadığı sürece orjinal metin kalıcı olarak değişmez
        // bir defalık yazdırıp metni korumak istersek sout içine yazarız metin değişmez
        System.out.println("Orjinal str karakter sayısı: " + str.length());

        // str da kalıcı değişklik yapalım bugün yerine yarın öğrendik yerine öğreneceğiz yazdıralım
        // case sensitive olduğu için büyük harf küçük harfelere dikkat et yoksa değiştirmez
        str = str.replace("Bugün", "Yarın");
        str = str.replace("öğrendik", "öğrenceğiz");
        System.out.println("Değiştirilmiş metin: " + str);

        // Bunun çıktısı "Yarın ne çok şey öğrenceğiz" olur
        // Çünkü atama yok!
        // Atama yukarıdaki gibi olur
        str.replace("ne cok", "ne az");
        System.out.println(str);
    }
}
