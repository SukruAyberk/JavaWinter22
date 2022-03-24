package day22_arrays;

import java.util.Arrays;

public class C10_Equals {

    public static void main(String[] args) {

        String arr1[] = {"S", "M", "A", "T"};
        String arr2[] = {"S", "M", "A", "T"};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit değil");
        }

        System.out.println(Arrays.equals(arr1, arr2));

    }
}
