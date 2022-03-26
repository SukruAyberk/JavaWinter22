package day27_constuctor;

public class ToyotaRunner {

    public static void main(String[] args) {

        Toyota t1 = new Toyota();
        // başka classdaki class level değişkenlere bu şekilde ulaşıyoruz
        // marka atanmış bir değer olarak herkeste ortak
        System.out.println(t1.marka); // Toyota
        System.out.println(t1.tekerAdet); // 4
        System.out.println(t1.model); // null - değer ataması yapmadık Stringin default değeri(null) geldi
        t1.model = "Corolla";
        t1.yakit = "Benzin";
        t1.yil = 2022;

        System.out.println(t1.model); // Corolla
        System.out.println(t1.yakit); // Benzin
        System.out.println(t1.yil); // 2022

        // T1 model: Corolla, yakit: Benzin, yil: 2022
        System.out.println("T1 model: " + t1.model + ", yakit: " + t1.yakit + ", yil: " + t1.yil);

        // yukarda yakıtı Benzin tanımlamıştık o yüzden benzine göre bu çıktıyı verdi
        t1.maxHiz(); // Benzinli araçlar maksimum 240 km/h hız yapar.

        System.out.println("");

        // t2 objesi için model yakıt ve yıl yeniden tanımlanmalı yoksa default değer döner
        // çünkü biz yukarda o değer atamalarını t1 objesi için yaptık
        Toyota t2 = new Toyota();
        System.out.println(t2.model); // null çünkü henüz değer atamadık t2 için
        System.out.println(t2.marka); // Toyota çıkar çünkü Toyota sabit bir değer
        t2.model = "Yaris";
        t2.yakit = "Benzin";
        t2.yil = 2021;

        // T2 model: Yaris, yakit: Benzin, yil: 2021
        System.out.println("T2 model: " + t2.model + ", yakit: " + t2.yakit + ", yil: " + t2.yil);
        t2.renkTercihleri(); // model adına göre renk tercihi methodundan aşaüıdaki çıktıyı verdi
        // Yaris renk seçenekleri sarı ve lacivert

    }
}
