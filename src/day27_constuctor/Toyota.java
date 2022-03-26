package day27_constuctor;

public class Toyota {

    String marka = "Toyota"; // üretilecek arabaların hepsi toyota olacağı için baştan atadık değeri
    int tekerAdet = 4; // arabaların 4 tekeri olduğu için baştan atadık
    boolean motoruVarMi = true; // motorsuz araba olmadığı için var dedik
    String model;
    String yakit; // benzinli dizel ve elektrikli arabalar olduğu için değer atamadık
    int yil; // her araba aynı yıl üretilmez eski arabalar bu sene üretilmedi o yüzden değer atamadık

    public void maxHiz() {
        if (yakit.equals("Benzin")) {
            System.out.println("Benzinli araçlar maksimum 240 km/h hız yapar.");
        } else if (yakit.equals("Dizel")) {
            System.out.println("Dizel araçlar maksimum 260 km/h hız yapar.");
        }
    }

    public void renkTercihleri() {

        if (model.equals("Corolla")) {
            System.out.println("Corolla renk seçenekleri kırmızı ve beyaz");
        } else if (model.equals("Yaris")) {
            System.out.println("Yaris renk seçenekleri sarı ve lacivert");
        }

    }

}
