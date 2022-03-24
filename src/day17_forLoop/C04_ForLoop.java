package day17_forLoop;

public class C04_ForLoop {

    public static void main(String[] args) {

        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }


        }


        int baslangic = 15;
        int bitis = 20;

        for (int j = baslangic; j <= bitis; j++) {
            if (j < bitis) {
                System.out.print(j + ", ");
            } else {
                System.out.println(j);
            }
        }

    }
}
