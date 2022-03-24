package day14_stringManipulation;

public class C05_SifreKontrol {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        //        System.out.println("Lütfen şifrenizi giriniz.");
        //        String password = scan.nextLine();

        String password = "Asdf12345a";

        boolean ilkHarf = false;
        if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
            ilkHarf = true;
        } else {
            System.out.println("İlk harfiniz büyük olmalı!");
        }


        boolean sonHarf = false;
        if ((password.charAt(password.length() - 1) >= 'a') && password.charAt(password.length() - 1) <= 'z') {
            sonHarf = true;
        } else {
            System.out.println("Son harfiniz küçük olmalı!");
        }

        boolean bosluk = false;
        if (!password.contains(" ")) {
            bosluk = true;
        } else {
            System.out.println("Şifrenizde boşluk olmamalı!");
        }

        boolean uzunluk = false;
        if (password.length() >= 8) {
            uzunluk = true;
        } else {
            System.out.println("Şifreniz en az 8 karakter içermeli!");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        } else {
            System.out.println("tekrar deneyin");
        }

    }
}
