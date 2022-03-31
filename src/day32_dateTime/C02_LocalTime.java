package day32_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

    public static void main(String[] args) {

        // objeyi oluşturduğum andaki değeri alır aşağıda farklı olması gerekirken
        // ikisini de aynı yazar
        // iki farklı zaman dilimi karşılaştırmak için yeni bir objeye ihtiyaç duyarız
        LocalTime tm = LocalTime.now();
        System.out.println(tm); // 22:14:37.335060400

        // aşağıdaki 0dan 100000'e kadar olan sayıların toplamını kaç saniyede gerçekleştirecek?
        // yukarıdaki sorunun cevabı için işlemden önce ve sonra birer time objesi oluşturup
        // aradaki farkı hesaplayabiliriz
        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += i;
        }
        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi); // 22:14:37.337060100

        double nano1 = tm.getNano();
        double nano2 = tmLoopSonrasi.getNano();

        System.out.println("İşlem " + (nano2 - nano1) + " nano saniyede bitti.");
        // İşlem 1000900.0 nano saniyede bitti.

        // ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000)); //14:59:46.764089200 1000 dk sonraki saat

        // istersek zone id kullanarak istediğimiz bölgenin saati içinde obje oluşturabiliriz
        LocalTime zoneTm = LocalTime.now(ZoneId.of("Japan")); // 15:02:49.337290400

    }
}
