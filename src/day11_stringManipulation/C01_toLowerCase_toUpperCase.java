package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {

    public static void main(String[] args) {

        String str = "Java güzeldir";

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }

}
