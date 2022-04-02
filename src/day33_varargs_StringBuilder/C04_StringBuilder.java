package day33_varargs_StringBuilder;

public class C04_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Yasasin Java");

        // Java'nın indexini bulmak için (8)
        System.out.println(sb1.indexOf("Java")); // 8

        // en son yazılan s harfinin indexi (4)
        System.out.println(sb1.lastIndexOf("s")); // 4

        // ilk yazılan s'yi bulmak için (2)
        System.out.println(sb1.indexOf("s")); // 2

        // 0-7 index arasını Ne guzel yaz
        System.out.println(sb1.replace(0, 7, "Ne guzel")); // Ne guzel Java

        // atama yapmadan hafıza da tutabiliyoruz
        System.out.println(sb1); // Ne guzel Java

        // toString() ile String manipulation yapabiliriz
        System.out.println(sb1.toString().toUpperCase()); // NE GUZEL JAVA

        // önce stringe çevirdik sonra method kullandık
        // bu yüzden immutable oldu o yüzden tekrar sb1 yazdırınca değişmez
        System.out.println(sb1); // Ne guzel Java

        // istediğimiz indexler arasındaki karakterleri silmek istersek
        System.out.println(sb1.delete(0, 3)); // guzel Java
        System.out.println(sb1.deleteCharAt(5)); // guzelJava

    }
}
