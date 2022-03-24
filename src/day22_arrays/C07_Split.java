package day22_arrays;

import java.util.Arrays;

public class C07_Split {

    public static void main(String[] args) {

        // String'i parçalara ayırıp array'e çevirme

        String str = "Java gun gectikce guzellesiyor";

        // str.split(" ");
        // space'den stringi böl dedik
        // space yerine de "," yazar
        // şimdi bunu bir arraye atamamız lazım
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, gun, gectikce, guzellesiyor]
        System.out.println(kelimeler[0]); // "Java"
        System.out.println(kelimeler[1]); // "gun"
        System.out.println(kelimeler[2]); // "gectikce"
        System.out.println(kelimeler[3]); // "guzellesiyor"

        // gectikceyi bulup onu öldürecek yerine virgül koyacak
        // yani 2 elementli bir dizi olacak
        String[] gectikce = str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));
        System.out.println(gectikce[0]); // "Java gun "
        System.out.println(gectikce[1]); // " guzellesiyor"

        String[] harfler = str.split("");
        System.out.println(Arrays.toString(harfler)); // [J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]


    }
}
