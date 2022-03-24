package day07_ifElseStatements;

public class C01_IfStatements {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a != b) {
            System.out.println("verilen sayılar eşittir");
        }

        if (a < 100) {
            System.out.println("a 100'den büyük");
        }

        if (a * b > 5) {
            System.out.println("sayıların çarpımı 5'den büyük");
        }

        /*
        birden fazla bağımsız if cümlesi olduğunda hepsinin body'si çalışacağı gibi
        hiçbirinin body'si çalışmayabilir.
         */


    }
}
