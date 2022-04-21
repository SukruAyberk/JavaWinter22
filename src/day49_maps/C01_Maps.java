package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        // Java'da collection üyesi bir yapıda data türü Object seçilirse
        // her data türünden değer ekleyebiliriz
        // Ancak bu durumda sürekli casting problemleriyle karşılaşabiliriz

        List<Object> list = new ArrayList<Object>();
        list.add("Ayberk");
        list.add(15);
        list.add(10.2);

        System.out.println(list); // [Ayberk, 15, 10.2]
        list.set(1, (Integer) list.get(1) + 10);
        System.out.println(list); // [Ayberk, 25, 10.2]

        // hızlı olması için hashmap seçtik
        Map<Integer, String> siniflist = new HashMap<Integer, String>();
        // bir sınıfta öğrenci no ve isim, soyisim, branş olarak map oluşturmak istiyoruz
        // key tek bir unique değerdir
        // ama value/değer birden fazla bilginin birleşiminden oluşabilir
        // bu durumda daha sonra istediğimiz bilgilere doğru şekilde ulaşabilmek için
        // tüm elementler için value ayni biçimde oluşturulmalı
        // (veri sıralaması ve şekilde açıdan)
        siniflist.put(101, "Ayberk, Gürfidan, QA");
        siniflist.put(102, "Veli, Yan, Dev");
        siniflist.put(103, "Ali, Yan, C#");
        System.out.println(siniflist); // {101=Ayberk, Gürfidan, QA, 102=Veli, Yan, Dev, 103=Ali, Yan, C#}
        System.out.println(siniflist.keySet()); // [101, 102, 103]
        System.out.println(siniflist.values()); // [Ayberk, Gürfidan, QA, Veli, Yan, Dev, Ali, Yan, C#]
    }
}
