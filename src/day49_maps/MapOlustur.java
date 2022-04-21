package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer, String> myMap() {

        Map<Integer, String> siniflist = new HashMap<Integer, String>();
        siniflist.put(101, "Ali, Can, Dev");
        siniflist.put(102, "Veli, Yan, QA");
        siniflist.put(103, "Ali, Yan, C#");

        return siniflist;
    }
}
