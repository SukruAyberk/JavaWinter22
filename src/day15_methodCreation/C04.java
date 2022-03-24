package day15_methodCreation;

public class C04 {

    // 1- method oluşturmak için methodun adını yaz ve creat et
    // 2- methoda giderken götürmem gereken variable varsa bunu methoda eklemeliyim
    // o yüzden method ismini yazınca parametre içine variable'ı yaz yani kelime

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("Girdiginiz karakter sayisi: " + kelime.length());
        System.out.println("Kelimenin tersten yazilisi: " + tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("Girdiginiz karakter sayisi: " + kelime.length());
        System.out.println("Kelimenin tersten yazilisi: " + tersKelime);
    }


    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("Girdiginiz karakter sayisi: " + kelime.length());
        System.out.println("Kelimenin tersten yazilisi: " + tersKelime);

    }

}
