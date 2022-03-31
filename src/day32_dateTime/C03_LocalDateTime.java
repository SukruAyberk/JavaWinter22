package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-03-31T22:34:21.425686800

        // 3 yıl 2 ay 10 gün 5 saat 5 dakika sonraki tarih ve saat - 2025-06-11T03:42:19.121079300
        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));

    }
}
