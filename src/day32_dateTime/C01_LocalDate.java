package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {

    public static void main(String[] args) {

        // bugünün tarihini aldı
        LocalDate trh = LocalDate.now(); // objenin oluşturulduğu tarihi trh'ye atar

        // istediğimiz yıl, ay be gün değerlerine göre bize obje oluşturur
        LocalDate baskaTrh = LocalDate.of(1996, 2, 15);

        System.out.println(trh); // 2022-03-31
        // get'li methodlarla tarih ile ilgili detay bilgilleri alabilirsiniz
        System.out.println(trh.getDayOfMonth()); // 31 ayın kaçıncı günü olduğunu yazdırdı
        System.out.println(trh.getDayOfWeek()); // THURSDAY haftanın hangi günü olduğunu yazdırdı
        System.out.println(trh.getMonthValue()); // 3 yıl içinde kaçıncı ayda olduğunu yazdırdı
        System.out.println(trh.getYear()); // 2022

        // bir tarihten istediğimiz kadar ileri veya geriye gidebiliriz
        System.out.println(trh.minusWeeks(20)); // 2021-11-11 20 hafta önceki tarih
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-21 5 hafta 3 gün önceki tarih
        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10 9 ay 10 gün sonraki tarih

        // İstediğimiz ülkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01 japonyada 1 nisan olmuş

        // is ile başlayan methodlar true/false döndürür
        System.out.println(LocalDate.now().isLeapYear()); // false artık yıl mı diye sorguladık
        System.out.println(trh.isAfter(baskaTrh)); // true yani bugünün tarihi doğum tarihimden sonra


    }
}
