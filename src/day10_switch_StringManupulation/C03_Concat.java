package day10_switch_StringManupulation;

public class C03_Concat {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candır";

        // Java Candır yazdıralım

        System.out.println(str1 + " " + str2);

        String cumle = str1.concat(" " + str2);
        System.out.println(cumle);

        // ya da
        String cumle2 = str1.concat(" ").concat(str2);
        System.out.println(cumle2);

        // concat içine sayı veya boolean bir değer yazsak kabul etmez
        // cumle2 = str1.concat(5); bunu yapabilmemiz için String hale getirmemiz gerekir aşağıdaki gibi
        cumle2 = str1.concat("" + 5);
        cumle2 = str1.concat(true + "");


    }
}
