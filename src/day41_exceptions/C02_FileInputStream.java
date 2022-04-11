package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {

    public static void main(String[] args) {

        /*
        Bir kod yazılırken olası exceptionlar öngörülüp
        exception oluştuğunda Java'nın ne yapmasını istediğimiz
        belirtilmelidir.

        1- Eğer exception oluşursa kodun çalışmaya etmesini istemiyorsak
        method isminin yanına oluşabilecek exception'ı deklare edebiliriz.

        2- Eğer exception olussa da kodun çalışmaya devam etmesini istiyorsak
        sorun oluşturabilecek kodu try catch bloğunun içine alır.
            -try bloğuna sorun çıkarabilecek kodu,
            -catch bloğuna oluşabilecek exception'ı ve olsa exception durumunda Java'nın
            ne yapmasını istediğimizi yazabiliriz.
         */

        String dosyayolu = "src/day41_exceptions/dosya.txt";
        try {
            FileInputStream fis = new FileInputStream(dosyayolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
