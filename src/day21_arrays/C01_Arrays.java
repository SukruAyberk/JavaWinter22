package day21_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5};
        int[] arr2 = {1, 2, 3};
        double[] arr3 = {10.2, 20.1, 50};
        String[] arr4 = {"Ali", "Veli", "Ayşe"};

        // assing mecburi mi? (Değil.)
        // kullanmadan önce mutlaka değer ataması yapmamız gerekiyor
        int sayi; // bunu yapabiliyoruz
        int[] arr5;

        // hem declare edip (değer atayıp) hemde atama yapacaksam iki türlü yapabilirim
        // 1- declare edip eşitliğin sağına süslü parantez içerisinde değerleri yazabilirim
        String[] arr6 = {"Ali", "Veli", "Ayşe"};
        // 2- içine değer atamadan oluşturmak isterseniz, boyutunu belirlememiz gerekir
        int[] arr7 = new int[5]; // java içinde 5 tane default değer olan bir array oluşturur
        System.out.println(arr7);


    }
}
