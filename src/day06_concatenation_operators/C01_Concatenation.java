package day06_concatenation_operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Güzel";
        int sayi1 = 5;
        int sayi2 = 3;

        // variable'ların değerlerini değiştirmeden aşağıdaki ifadeleri bu variableları kullanarak yazdır

        // Java5Güzel
        System.out.println(str1 + sayi1 + str2);

        // 2Güzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        // Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        // 53Güzel
        System.out.println((sayi1) + (sayi2 + str2));
        System.out.println("" + sayi1 + sayi2 + str2);

        /*
        Eğer tamamen sayılardan oluşan bir String varsa ve biz bunu int'a çevirmek istersek
        Integer.valueOf(str) gibi bir çevrim yapalıyız.

        Bir sayıyı Stringe çevirmek istersek, "" + sayi yaparız.
         */



    }
}
