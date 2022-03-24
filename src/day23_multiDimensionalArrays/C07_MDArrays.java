package day23_multiDimensionalArrays;

public class C07_MDArrays {

    public static void main(String[] args) {

        // Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        // ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 0, 2}};
        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            // burada ilk köşeli parantez i = 0 için {1, 2, 3} kısmına erişicez
            // arr[i].length - 1 kısmındaysa {1, 2, 3} buranın en son elemanını seçtik yani 3
            // 1*3 = 3
            // burada ilk köşeli parantez i = 1 için {4, 5} kısmına erişicez
            // arr[i].length - 1 kısmındaysa {4, 5} buranın en son elemanını seçtik yani 5
            // 3*5 = 15
            // burada ilk köşeli parantez i = 2 için {6, 0, 2} kısmına erişicez
            // arr[i].length - 1 kısmındaysa {6, 0, 2} buranın en son elemanını seçtik yani 2
            // 15*2=30
            // i = 3 olduğunda döngüden çıkacak 30 yazdırcak
            carpim *= arr[i][arr[i].length - 1];

        }

        System.out.println("Son elementlerin çarpımı = " + carpim);

    }
}
