package day34_accessModifier_Encapsulation;

public class C03 {

    // encapsule edeceğimiz 2 variable olsun

    private int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "sayi = " + sayi +
                ", str = " + str;
    }
}
