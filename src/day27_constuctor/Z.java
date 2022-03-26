package day27_constuctor;

public class Z {

    String isim;
    String soyIsim;
    int numara;
    boolean gercekMi;

    public Z(String ism, String soyism, int no, boolean grc) {

        isim = ism;
        soyIsim = soyism;
        numara = no;
        gercekMi = grc;

    }

    public Z(String isim, String soyIsim, int numara) {

        // instance variable isimleri ve parametre isimleri aynı olduğu için
        // this komutunu kullandık

        this.isim = isim;
        this.soyIsim = soyIsim;
        this.numara = numara;

    }

    public String toString() {

        return ("İsim: " + isim + ", Soyisim: " + soyIsim + ", Numara: " + numara + ", Gerçek mi: " + gercekMi);

    }



}
