package day13_stringManipulation;

public class EskiSoru1 {

    public static void main(String[] args) {

        // String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str = "Java ogrenmek123 Cok guzel@";
        String str2 = str.replaceAll("\\d", "");
        String str3 = str2.replace("C", "c");
        String str4 = str3.replace("@", ".");
        System.out.println(str4);
    }
}
