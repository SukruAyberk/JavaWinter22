package day20_scope;

public class C03_LocalVariable {

    public static void main(String[] args) {

        int sayi = 0;

        // sayıya değer atamazsak loop içindeki soutta hata verir çünkü java ne yazdıracağını bilmiyor
        // sayi++ yazsanda fayda etmez o yüzden sayıya başlangıç değeri ata
        for (int i = 0; i <= 10; i++) {
            System.out.println(sayi);
        }

    }

}
