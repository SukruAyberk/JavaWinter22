package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer, String> myMap() {

        Map<Integer, String> siniflist = new HashMap<Integer, String>();
        siniflist.put(101, "Ali, Can, Dev, 1453");
        siniflist.put(102, "Veli, Yan, QA, 1990");
        siniflist.put(103, "Ali, Yan, C#, 2001");
        siniflist.put(103, "Fatma, Han, Java#, 2002");

        return siniflist;
    }
}
