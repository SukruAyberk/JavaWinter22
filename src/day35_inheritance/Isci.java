package day35_inheritance;

public class Isci extends Personel {



    public static void main(String[] args) {

        Personel objPers = new Personel();
        objPers.name = "Gamzenur";
        objPers.surname = "Güçlü";
        objPers.adres = "Muğla";

        Isci objIsci = new Isci();
        objIsci.name = "Ayberk";
        objIsci.surname = "Gürfidan";
        objIsci.adres = "Isparta";

        System.out.println(objPers);
        System.out.println(objIsci);

    }

}
