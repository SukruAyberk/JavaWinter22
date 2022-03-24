package day23_multiDimensionalArrays;

public class C03_MDArrays {

    public static void main(String[] args) {

        // boyutları belirli bir arrayi elementleri girmeden oluşturalım
        // Bir okulda içinde 24 öğrenci olan 8 sınıf vardır

        int[][] arr = new int[8][24];

        // bir ilçede her birinde 24 öğrencilik 8 sınıf bulunan 5 okul var

        int[][][] ilce = new int[5][8][24];

        // bir okulda 3 tane 24 kişilik, 2 tane de 22 kişilik sınıf var
        int[][] sinif24 = new int[3][24];
        int[][] sinif22 = new int[2][22];

        // oluştururken elementleri atama yaparsak farklı uzunlukta inner arrayler tanımlayabiliriz
        int[][] arr1 = {{3, 1, 7, 5}, {6, 10}};


    }
}
