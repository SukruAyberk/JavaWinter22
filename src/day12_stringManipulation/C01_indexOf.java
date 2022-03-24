package day12_stringManipulation;

public class C01_indexOf {

    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //   - Girilen kelime cumlede kullanilmamis.
        //   - Girilen kelime cumlede 1 kere kullanilmis.
        //   - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle = "Java öğren, yeni program ile yeni bir sayfa aç";
        String kelime = "yeni";

        int ilkKullanim = cumle.indexOf(kelime);
        int ikinciKullanim = cumle.indexOf(kelime, ilkKullanim + 1);

        if (ilkKullanim == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ikinciKullanim == -1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

    }
}
