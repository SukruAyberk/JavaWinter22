package day09_ternary_Switch;

public class C04_NestedTernary {

    public static void main(String[] args) {

        int sayi = 150;

        // ternary bize sonuç getirdiğinden ya sonucu direkt yazdırmalıyız
        // ya da bir değişkene atamalıyız
        // Eğer sonuçlar farkılı data türlerindeyse (aşağıdaki gibi bir int bir String var)
        // atama yapacağımız variable'ın data türü tek olacağından atama yapamayız
        // Sadece sout içinde direkt yazdırabiliriz
        // String sonuc = sayi > 100 ? sayi*sayi : "sayı yüzden büyük olmalı";

        System.out.println(sayi > 100 ? sayi*sayi : "sayı yüzden büyük olmalı");


    }
}
