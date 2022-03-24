package day13_stringManipulation;

public class EskiSoru2 {

    public static void main(String[] args) {

        String str1 = "$13.99";
        String str2 = "$10.55";

        double sonuc = Double.parseDouble(str1.replace("$", "")) + Double.parseDouble(str2.replace("$", ""));
        System.out.println(sonuc);




    }
}
