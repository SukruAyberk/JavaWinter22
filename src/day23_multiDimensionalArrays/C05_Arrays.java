package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {

    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir metod oluştur

        int[] arr = {3, 5, 7}; // 3 elementli bir array buna dördüncü elementi ekle

        // RTE verir eklediğimiz index arrayin sınırlarının dışında
        // Array'de olmayan bir index'e atama yapamayız
        // arr[3] = 8;

        // Böyle bir değer atamasına da izin vermez
        // Var olan bir array'e içinde aynı boyutta bile olsa direkt yine değerler içeren
        // array atayamayız
        // arr = {1, 3, 5};

        // Yeniden tanımlama yaptığımız zaman kabul eder içindeki değerleri default olarak 0 yapar
        // Bu durumda length'i 3 olan arrayi öldürür, length'i 4 olan yepyeni bir array oluşturur
        arr = new int[4];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]

        // Bunu kabul etti
        int[] arrYeni = new int[5];
        arr = arrYeni;
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]

        arrYeni[0] = 2;
        arrYeni[3] = 5;
        arr = arrYeni;
        System.out.println(Arrays.toString(arr)); // [2, 0, 0, 5, 0]

        // Bir array'e içinde hazır elementlerin olduğu yeni bir array atamak istersek
        // bunu {1,2,3} yazark değil
        // new int[3] diyerek oluşturup sonra değer atayarak tamamladığımız bir array'i
        // assign ederek yapabiliriz

        int[] arrEnYeni = {1, 2, 3, 4, 5};
        arr = arrEnYeni;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        // [2, 0, 0, 5, 0] olan array'i [1, 2, 3, 4, 5] ile değiştirdik

        // yani örneğin var olan 4 elemanlı array'i 7 elemanlı array yapamayız
        // 7 elemanlı bir array oluştururuz ve 4 elemanlı array'i 7 elemanlı array'e assign ederiz(eşitleriz)


    }
}
