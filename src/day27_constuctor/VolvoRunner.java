package day27_constuctor;

public class VolvoRunner {

    public static void main(String[] args) {

        // Atanmış değerleri yazar
        // atanmayanların defaultunu yazar

        Volvo v1 = new Volvo();
        System.out.println(v1.marka); // Volvo
        System.out.println(v1.mensei); //İsveç
        v1.yakit = "Dizel";
        v1.elektrikliMi = false; // yakıt dizel olduğu için false yaptık

        // araba elektrikli olmadığı için maxHizAta()
        // methodundan otomatikPilot'u false atadı
        // çünkü otomatik pilot sadece elektrikliyse var diye düşünmüştük en başta
        System.out.println(v1.maxHiz); // 240

        // araba elektrikli otomatikPilotSorgusu()
        // methodundan mazHix'i 240 atadı
        System.out.println(v1.otomatikPilot); // false

        // Yukaroda tek tek yazdırmak yerine toString kullandık
        // çıktı: Model: null, Yakıt: Dizel, Maksimum Hız: 240
        System.out.println(v1.toString1());

        // çıktı: Volvo{marka='Volvo', mensei='İsveç', model='null', elektrikliMi=false, yil=0, yakit='Dizel', otomatikPilot=false, maxHiz=240}
        // toString'i generate ettik direkt
        System.out.println(v1.toString());

        Volvo v2 = new Volvo();
        v2.yakit = "Elektrikli";
        v2.elektrikliMi = true;
        v2.model = "XC90";

        System.out.println(v2.toString1()); // Model: XC90, Yakıt: Elektrikli, Maksimum Hız: 240

    }

}
