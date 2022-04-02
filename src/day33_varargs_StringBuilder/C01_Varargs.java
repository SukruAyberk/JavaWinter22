package day33_varargs_StringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        // Kaç tane String verilirse verilsin içlerinden en uzun olanı yazdıran bir method oluşturun

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ayberk";
        String str4 = "AyberkSDGSDGSghsg";
        String str5 = "A";

        // yazılan argüment sayısı sabitse her zamanki gibi bir method oluşturabiliriz
        // ancak argument sayısının değişme ihtimali varsa o zaman varargs tercih edilir
        enUzunKelime(str1, str2, str3, str4, str5);

    }

    private static void enUzunKelime(String... str) {
        String enUzunStr = "";
        for (String i : str) {

            if (i.length() > enUzunStr.length())
                enUzunStr = i;
        }

        System.out.println("En uzun kelime: " + enUzunStr);

    }


}
