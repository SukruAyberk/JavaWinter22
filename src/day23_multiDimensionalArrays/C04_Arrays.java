package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {

    public static void main(String[] args) {

        // kullanıcıya kaç elementlik bir array oluşturacağını sorun
        // arrayi oluşturup elementleri kullanıcıdan alıp arraye atayın

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç elemanlı array oluşturmak istersiniz: ");
        int uzunluk = scan.nextInt();

        int arr[] = new int[uzunluk]; // girdiğimiz uzunluğu arrayin sınırını belirlemek için kullandık

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array için " + (i + 1) + ". elemanı girin: ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Oluşturduğunuz dizi = " + Arrays.toString(arr));

    }
}
