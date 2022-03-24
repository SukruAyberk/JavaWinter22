package day23_multiDimensionalArrays;

public class Soru1 {

    public static void main(String[] args) {
        // Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
        // yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int carpim = 1;

        carpimMethod(arr, carpim);
    }

    private static void carpimMethod(int[][] arr, int carpim) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim *= arr[i][j];
            }
        }

        System.out.println(carpim);

    }
}
