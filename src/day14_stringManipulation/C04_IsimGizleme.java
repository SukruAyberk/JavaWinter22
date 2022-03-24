package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        String isim = "oguzhan";
        String soyIsim = "BALKAYA";
        String krediKNo = "1234567890123456";

        String yeniIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\S", "*");
        String yeniSoyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).replaceAll("\\S", "*");

        String yeniKrediKNo1 = krediKNo.substring(0,4).replaceAll("\\S", "*") + " " + krediKNo.substring(4,8).replaceAll("\\S", "*") + " " + krediKNo.substring(8, 12).replaceAll("\\S", "*") + " " + krediKNo.substring(12);
        // yada
        String yeniKrediKNo2 = "**** **** **** " + krediKNo.substring(12);

        System.out.println("Isim - Soyisim: " + yeniIsim + " " + yeniSoyIsim);
        System.out.println("Kredi Kartı Numaranız zor: " + yeniKrediKNo1);
        System.out.println("Kredi kartı Numaranız basit: " + yeniKrediKNo2);
    }
}
