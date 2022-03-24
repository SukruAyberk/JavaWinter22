package day12_stringManipulation;

public class C04_endsWith {

    public static void main(String[] args) {

        // Kullanicidan email adresini girmesini isteyin, mail
        // @gmail.com icermiyorsa “lutfen gmail adresi giriniz”
        // @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email = "ayberk546@gmail.com";
        String arananKelime = "@gmail.com";

        if (!email.contains(arananKelime)) {
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananKelime)) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontol edin");
        }

    }
}
