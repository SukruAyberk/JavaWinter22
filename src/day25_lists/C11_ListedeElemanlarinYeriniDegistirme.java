package day25_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_ListedeElemanlarinYeriniDegistirme {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // verilen bir listede istenen 2 indexteki elementlerin yerini kalici olarak degistiren bri method olustur

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(sayilar);

        int ilkIndex = 2;
        int ikinciIndex = 5;

        sayilar = swapElements(sayilar, ilkIndex, ikinciIndex);
        System.out.println(sayilar);

    }

    private static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir temp sayıi olustur
        // verilen indexlerdeki sayıları yer değiştir
        // indexleri kontrol edip sınırın ötesinde index verildiyse uyarı mesajı yaz

        List<Integer> log = new ArrayList<Integer>();


        System.out.print("Lütfen yerini değiştirmek istediğiniz sayının index değerini girin: ");
        ilkIndex = scan.nextInt();
        System.out.print("Yeni index değerini girin: ");
        ikinciIndex = scan.nextInt();


        if ((ilkIndex >= sayilar.size() || ilkIndex < 0) && (ikinciIndex >= sayilar.size() || ikinciIndex < 0)) {
            System.out.print("Girdiğiniz index geçersiz lütfen tekrardan index girin: ");
            ilkIndex = scan.nextInt();
            System.out.print("Yeni index değerini girin: ");
            ikinciIndex = scan.nextInt();
        } else {

            // [1, 3, 5, 3, 5, 1, 7] 0 ve 1 için çıktı
            // sayilar = [5, 3, 5, 1, 7], log = [1, 3]
            // [3, 1, 5, 3, 5, 1, 7]

            if (ilkIndex < ikinciIndex) {
                log.add(sayilar.remove(ilkIndex));
                log.add(sayilar.remove(ikinciIndex - 1)); // uzunluk bir azaldı o yüzden -1 dedik

                sayilar.add(ilkIndex, log.get(1));
                sayilar.add(ikinciIndex, log.get(0));


            } else if (ilkIndex > ikinciIndex) {

                // [1, 3, 5, 3, 5, 1, 7] 1 ve 0 için çıktı
                // ilk index 1 yani 3
                // ikinci index 0 yani 1
                // sayilar = [3, 5, 3, 5, 1, 7], log =[3, 1]
                // [3, 1, 5, 3, 5, 1, 7]


                log.add(sayilar.remove(ilkIndex));
                log.add(sayilar.remove(ikinciIndex));

                sayilar.add(ikinciIndex, log.get(0));
                sayilar.add(ilkIndex, log.get(1));


            } else {
                System.out.println("Aynı indexteki elemanları yeri değiştirilemez!");
            }


        }


        return sayilar;
    }
}
