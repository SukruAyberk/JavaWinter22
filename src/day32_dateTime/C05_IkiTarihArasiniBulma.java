package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1996, 2, 15);

        System.out.println(Period.between(dogumGunu, bugun)); // P26Y1M16D

        System.out.println(Period.between(dogumGunu, bugun).getDays()); // yukarıdaki günler arasındaki farkı verdi
        System.out.println(Period.between(dogumGunu, bugun).getYears()); // 26 yıllar arasındaki fark yani yaşım

    }

}
