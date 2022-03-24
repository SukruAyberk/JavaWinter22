package day15_methodCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {

        //Stringi yazdıran metjod oluştur
        String str = "Ali";

        stringYazdir(str);

        // Hoşgeldiniz diyen method oluştur
        welcome();

        // Kapanma mesajı yazan method oluştur
        kapanmaMethodu();

        System.out.println();

        // önce hoşgeldin yazdır
        // sonra bir string yazdır
        // sonra kapanma yap

        // welcome();
        // stringYazdir("Java gun gectikce guzellesiyor.");
        // kapanmaMethodu();
        // ya da method içine method çağırırız

        welcome();

    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiğiniz için teşekkürler");
    }

    public static void welcome() {
        System.out.println("Hoşgeldiniz");
        stringYazdir("Java gun gectikce guzellesiyor.");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
