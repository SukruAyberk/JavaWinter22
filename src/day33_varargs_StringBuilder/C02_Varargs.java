package day33_varargs_StringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        // Soru - Parametre olarak bir int ve istediğimiz kadar String alan
        // en uzun kelimenin harf sayısı ile int parametre değerini
        // çarpıp sonucu yazdıran bir method oluştur

        int sayi = 5;
        String str1 = "Gamze";
        String str2 = "Ayberk";
        String str3 = "Ali";

        carpimMethodu(sayi, str1, str2, str3);

        // eğer bir methodda varargs'ın dışında bir paramtere varsa
        // varargs'dan önce yapılması gerekir
        // int sayi'yi parametra içinde en sağa koysak da kabul etmez
        // bu sebeple birden fazla varargs olamaz
    }

    private static void carpimMethodu(int sayi, String... str) {
        String enUzunStr = "";
        for (String i : str) {
            if (i.length() > enUzunStr.length()) {
                enUzunStr = i;
            }
        }

        System.out.println("İstenen değer = " + sayi * enUzunStr.length());

    }
}
