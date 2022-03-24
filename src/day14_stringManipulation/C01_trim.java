package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str = "   Siz ne derseniz deyin, Java bildigini okur.   ";
        System.out.println(str + " " + str.length());
        str = str.trim();
        System.out.println(str + " " + str.length());


    }
}
