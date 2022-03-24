package day16_methodCreation;

public class C03_ForLoop {
    public static void main(String[] args) {

        // verilen Stringi tersten yazdıran bir kod yaz

        String str = "Valla bu java cok zevkli";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));
        }

    }
}
