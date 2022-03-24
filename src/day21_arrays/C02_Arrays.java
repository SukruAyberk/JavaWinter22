package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String[] arr1 = {"Ali", "Veli", "Ayşe"};
        // array içindeki elementlere ulaşabilmek için index kullanırız

        System.out.println(arr1[0]); // Ali

        arr1[1] = "Esila"; // Veli gitti esila geldi
        System.out.println(arr1[1]);

        int[] arr2 = new int[4];
        System.out.println(arr2[0]);

        // arrayin tamamını yazdırmak istersek
        System.out.println(arr2); // [I@58372a00 -> stackteki adresine gider orada arrayin kendisi olmadığı için referansını yazdırdı
        // [I@58372a00 -> stackteki adresine gider orada arrayin kendisi olmadığı için referansını yazdırdı
        // arrayler non-primitive olduklarından direkt yazdırmak istersek java referans bilgisini yazdırır

        // bu mantıklı değil ama denedik oluyor 4 tane sıfır yazdırdı
        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        // arrayi yazdırmak için javadaki Arrays classından toString methodu kullanılır
        System.out.println(Arrays.toString(arr2));

        arr2[1] = 11;
        arr2[3] = 22;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));



    }
}
