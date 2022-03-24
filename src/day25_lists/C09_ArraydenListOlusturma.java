package day25_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListOlusturma {

    public static void main(String[] args) {

        // ÇOK GEREKSİZ BAKMASANDA OLUR

        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);

        // arrayden liste yaptığımız için ekleme çıkarma yapamayız
        //list.add("J");
        //System.out.println(list);

        System.out.println("18. satırda list: " + list);

        // bu arada arraydeki bir elemanı değiştirdik ve bu liste yansıdı
        arr[1] = "F";
        System.out.println("22. satırda Array: " + Arrays.toString(arr));
        System.out.println("23. satırda list: " + list);

        // burada listteki bir elemanı değiştirdik ve bu arraye yansıdı
        list.set(0, "Y");
        System.out.println("26. satırda Array: " + Arrays.toString(arr));
        System.out.println("27. satırda list: " + list);

    }
}
