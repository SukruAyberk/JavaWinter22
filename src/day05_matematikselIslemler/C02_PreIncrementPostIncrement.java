package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi1 = 10, sayi2 = 20, sayi3 = 30;

        sayi2 = sayi1++;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
        // çıktı -> 11, 10, 30
        // bunun olmasının sebebi, önce sayi2'ye değer atandı yani 10 daha sonra sayi1 bir artılır.

        sayi3 = ++sayi1;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
        // sayi2'yi yukarda 10 olarak değer atamıştık o direkt yazılır
        // sonra ki adım da sayi1 in değeri (11) artırılır ve sayi3e atanır

        System.out.println(sayi3++); // önce 12 yazdıracak sonra sayi3 = 13
        System.out.println(sayi3); // 13 yazdırdı

        System.out.println(--sayi2); // önce azaltır sonra 9 yazdırır
                                     // önce sayi2 = 9 sonra konsola 9 yazdırır


    }
}
