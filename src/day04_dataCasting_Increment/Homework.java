package day04_dataCasting_Increment;

public class Homework {
    public static void main(String[] args) {


        //1. soru
        System.out.println("1. soru");
        byte sayi = 1;
        System.out.println(sayi);

        int sayi2 = sayi;
        System.out.println(sayi2);

        short sayi3 =  sayi;
        System.out.println(sayi3);

        double sayi4 = sayi;
        System.out.println(sayi4);

        float sayi5 = sayi;
        System.out.println(sayi5);



        // 2. soru
        System.out.println("2. soru");
        int sayi6 = 284;
        short sayi7 =(short) sayi6;
        System.out.println(sayi7);



        //3. soru
        System.out.println("3. soru");
        float f = 2.346f;
        System.out.println(f);



        //4. soru
        System.out.println("4. soru");
        double temp = 255.36;
        int temp2 = (int) temp;
        System.out.println(temp2);
        byte temp3 =(byte) temp2;
        System.out.println(temp3);



        // 5. soru
        System.out.println("5. soru");
        int sayi8 = 15, sayi9 = 2;
        System.out.println(sayi8/sayi9);




        //6. soru
        System.out.println("6. soru");
        int a = 10;
        double b = 65;
        System.out.println(a/b);


        // 7. soru
        System.out.println("7.soru");
        short shrt = 23;
        long d = 654;
        double sayi10 = 346;
        long sayi11 = 2854;
        System.out.println(shrt/d);
        System.out.println(sayi10*sayi11);




    }


}
