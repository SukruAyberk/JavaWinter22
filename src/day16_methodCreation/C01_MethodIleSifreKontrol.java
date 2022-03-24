package day16_methodCreation;

public class C01_MethodIleSifreKontrol {

    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        // bu 4 kontrolü method ile yap

        String sifre = "Abc123abn";
        boolean ilkHarfKontrol = ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol = sonHarfKontrolEt(sifre);
        boolean boslukKontrol = boslukKontrolEt(sifre);
        boolean uzunlukKontrol = uzunlukKontrolEt(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol) {
            System.out.println("Şifreniz başarılı bir şekilde tanımlandı.");
        } else {
            System.out.println("İşlem başarısız lütfen tekrar deneyin.");
        }

    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc = false;
        if (sifre.length() >= 8) {
            uzunlukKontrolSonuc = true;
        } else {
            System.out.println("Şifreniz en az 8 karakter olmalı!");
            uzunlukKontrolSonuc = false;
        }

        return uzunlukKontrolSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc = false;
        if (!sifre.contains(" ")) {
            boslukKontrolSonuc = true;
        } else {
            System.out.println("Şifreniz boşluk içermemeli!");
            boslukKontrolSonuc = false;
        }
        return boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf = sifre.charAt(sifre.length() - 1);
        boolean sonHarfSonuc = false;

        if (sonHarf >= 'a' && sonHarf <= 'z') {
            sonHarfSonuc = true;
        } else {
            System.out.println("Şifrenizin son harfi küçük olmalı!");
            sonHarfSonuc = false;
        }

        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf = sifre.charAt(0);
        boolean ilkHarfSonuc = false;
        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            ilkHarfSonuc = true;
        } else {
            System.out.println("Şifrenizin ilk harfi büyük olmalı!");
            ilkHarfSonuc = false; // bunu yazmaya gerek yok zaten başlangıç değeri olarak false atadık
        }
        return ilkHarfSonuc;
    }


}
