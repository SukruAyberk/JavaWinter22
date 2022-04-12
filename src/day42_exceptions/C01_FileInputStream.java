package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {

    public static void main(String[] args) {

        String dosyayolu = "src/day41_exceptions/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyayolu);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Exceptionlar içinde parent ilişkisi mevcuttur
        Eğer bir kod için birden fazla exception oluşma ihtimali varsa
        Öncelikle olası exceptionlar parent-child ilişkisi taşıyor mu bakmamız gerekir
        Eğer parent-chid ilişkisi yoksa, istediğimiz sırada catch cümleleri oluşturabiliriz

        Eğer pearent-child ilişkisi varsa karar bize kalmış
        istersek sadece parent yazarız
        istersek önce child sonra parent yazarız
         */

        /*
        Altı kırmızı her kod CTE değildir.
        java syntax hatalarını derleme esnasında(compile) farkeder ve altını çizer
        Biz bugüne kadar tamamına CTE diyorduk ancak exception konusu ile birlikte
        Compile Time Exception kavramı da hayatımıza girdi
         */

    }

}
