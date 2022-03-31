package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-03-31T22:46:32.122876

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(formatter.format(tarihSaat)); // 31/Mart/2022

        DateTimeFormatter formatterSaat = DateTimeFormatter.ofPattern("h:mm a");

        // "HH : mm" - 22 : 53
        // "hh : mm" - 10 : 53
        // "hh : mm a" - 10 : 54 ÖS
        // "h:mm a" - 10:54 ÖS
        System.out.println(formatterSaat.format(tarihSaat));

        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         h : 12 saat dilimine göre tek rakam olanları tek rakam olarak yazdırır
         hh : 12 saat dilimine göre iki rakam olarak yazdırır

         m : dakikayı önünde sıfır olmadan yazar
         mm : dakikayı önünde sıfırla beraber yaza

         a yazarsak AM veya PM degerini yazar


         */


    }

}
