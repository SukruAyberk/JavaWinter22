package day14_stringManipulation;

public class C03_StringIntToplama {

    public static void main(String[] args) {

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D", "");
        str2 = str2.replaceAll("\\D", "");

        double toplam = Double.parseDouble(str1) + Double.valueOf(str2);
        System.out.println(toplam/100);
    }
}
