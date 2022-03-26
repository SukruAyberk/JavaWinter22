package day27_constuctor;

public class Volvo {

    String marka = "Volvo";
    String mensei = "İsveç";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot = otomatikPilotSorgusu(); //bunu methoda eşitledik
    // elektrikliyse oto olcak
    int maxHiz = maxHizAta();

    public Volvo() {
        // Aşağıdaki methodu oluşturunca default contructor öldü
        // o yüzden manuel olarak parametresiz constructor oluşturduk
    }

    public Volvo(String mdl, boolean elk, int yl, String ykt) {

        // yukarıdakilerle eşitlememiz lazım
        // hata vermemesi içinde boş constructor oluşturmak lazım
        model = mdl;
        elektrikliMi = elk;
        yil = yl;
        yakit = ykt;
    }

    public int maxHizAta() {
        int maxHiz = 0;

        if (elektrikliMi) {
            maxHiz = 160;
        } else {
            maxHiz = 240;
        }
        return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {
        boolean sonuc = false;
        if (elektrikliMi) {
            sonuc = true;
        }
        return sonuc;
    }

    public String toString1() {
        String arabaOzellikleri = "Model: " + model + ", Yakıt: " + yakit + ", Maksimum Hız: " + maxHiz;

        return arabaOzellikleri;
    }


}
