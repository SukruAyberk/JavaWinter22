package day15_methodCreation;

public class C09_MethodCreation {

    public static void main(String[] args) {

        String isim = "oguzhan";
        String soyIsim = "BALKAYA";
        String krediKNo = "1234567890123456";

        // eğer bir methoddan bir işlem yapmasını ve yatprığı işlemi bize getirmesini isterseniz
        // return type void değil, bize getireceği data türünde olmalıdır
        // bana isim ve soyismin gizlenmiş halini getirmesini istiyorum
        // beklediğim donuş String olur yani void yerine String yaz method sonuna return koy

        // veriyi sadece yazdırmak istiyorsak void
        // ama veriyi döndürüp bunu kullanmak istiyorsak voidsiz yapıcaz
        // ama bunu da bir variable'a atamamız lazım
        String gizlenmisIsimSoyisim = isimSoyisimGizle(isim, soyIsim);
        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKKNo = krediKartiGizle(krediKNo);
        System.out.println(gizlenmisKKNo);

    }

    // eğer yazdırıyorsak method void olabilir
    // void yazıyorsak bana bir şey döndürmez
    // bir şey döndürmesini istiyorsam voidsiz yazcam


    public static String krediKartiGizle(String krediKNo) {

        String yeniKrediKNo1 = krediKNo.substring(0, 4).replaceAll("\\S", "*") + " " + krediKNo.substring(4, 8).replaceAll("\\S", "*") + " " + krediKNo.substring(8, 12).replaceAll("\\S", "*") + " " + krediKNo.substring(12);
        // yada
        String yeniKrediKNo2 = "**** **** **** " + krediKNo.substring(12);
        return yeniKrediKNo2;
    }

    public static String isimSoyisimGizle(String isim, String soyIsim) {
        String yeniIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\S", "*");
        String yeniSoyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\S", "*");
        // method oluşturmada 3. adım
        // method çalışınca sadece bir şey mi yazdıracak
        // yoksa bize bir data mı döndürecek buna karar vermektir
        // bu soruda gizlenmiş isim soyisim döndürmesi istendiğinden return type'ı void değil String yaptık
        // ve methodun sonuna return edilecek datayı yazdık
        return yeniIsim + " " + soyIsim;
    }

}
