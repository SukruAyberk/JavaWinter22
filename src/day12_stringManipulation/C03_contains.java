package day12_stringManipulation;

public class C03_contains {

    public static void main(String[] args) {

        // Kullanicidan email adresini girmesini isteyin, mail
        // @gmail.com icermiyorsa “lutfen gmail adresi giriniz”
        // @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        // benim yaptığım

        //  Scanner scan = new Scanner(System.in);
        //        System.out.println("Lütfen mail adresinizi giriniz: ");
        //        String mail = scan.nextLine();
        //
        //        // içeriyorsa demek için bu şekilde
        //        if (mail.contains("@gmail.com") || mail.contains("@hotmail.com") || mail.contains("@outlook.com")) {
        //            System.out.println("mail adresiniz kaydedildi");
        //        } else {
        //            System.out.println("lutfen yazimi kontol edin");
        //        }
        //
        //        // içermiyorsa demek için
        //        if (!mail.contains("@gmail.com") || mail.contains("@hotmail.com") || mail.contains("@outlook.com")) {
        //            System.out.println("lutfen yazimi kontol edin");
        //        } else {
        //            System.out.println("mail adresiniz kaydedildi");
        //        }

        // hocanın yaptığı

        String email = "ayberk546@gmail.com";
        String arananKelime = "@gmail.com";

        if (!email.contains(arananKelime)) {
            System.out.println("Lütfen gmail adresi giriniz");
        } else if (email.lastIndexOf(arananKelime) == email.length() - 10) { // @gmail.com'u son başa 1den başlayarak saydık
            System.out.println("Email adresiniz kaydedildi.");
        } else {
            System.out.println("Lütfen yazımı kontrol edin.");
        }

    }
}
