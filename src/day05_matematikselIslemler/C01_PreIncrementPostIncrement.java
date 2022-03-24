package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi = 10;
        sayi++;
        System.out.println(sayi); // 11
        sayi++;
        System.out.println(sayi); // 12

        System.out.println(++sayi); // önce artırır sonra yazdırır yani değer 13
        System.out.println(sayi++); // önce yazdırır sonra artırır değer 14 ama konsola 13 yazar
        System.out.println(sayi);   // burada artık hafızasına aldığı 14 değerini yazdı

        int a = 15;
        int b = ++a;
        System.out.println(b);

        int c = a++;
        System.out.println(c);

    }
}
