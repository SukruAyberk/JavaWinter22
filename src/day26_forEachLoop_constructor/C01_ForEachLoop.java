package day26_forEachLoop_constructor;

public class C01_ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // for-each loop çalıştırmak için hedef bir collection vermeliyiz

        for (int i : arr) {
            System.out.print(i + " ");
        }

        // avantajı: index, başlangıç deperi, bitiş değeri gibi detaylarla
        // uğraşmamıza gerek kalmadan collections'dan tüm elementleri bize getirir
        // dezavantajları: index'e bağlı bir işlem yapamayız


    }
}
