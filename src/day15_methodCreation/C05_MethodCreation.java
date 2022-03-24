package day15_methodCreation;

public class C05_MethodCreation {

    public static void main(String[] args) {

        // 1- baska bir class'dan method cagirmak icin once class adi yazariz
        // class adini girince zaten bize o class'daki methodlari siralayacaktir
        // 2- daha sonra su an bulundugumuz class'in icindeki degiskeni method icine yazariz.
        // 3- bitti :D
        // Farkli class'dan method cagirmak icin o methodun public olmasi lazim private olursa cagiramayiz
        // Ayni class icinde private ve public olsa da cagirabiliriz
        // Method ancak cağırılırsa çalışabilir
        String str = "Ali";
        C04.ucHarfiTersineCevir(str);
    }
}
