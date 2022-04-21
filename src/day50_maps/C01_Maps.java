package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        // Sınıf listesini düzenli bir şekilde yazdırmak
        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        /*
        Eğer keylere tek tek ulaşmak istersek index yapısına ihtiyacımız var
        Ancak map index yapısını desteklemez bunun için keyleri önce bir Set içine
        oradan da setin tüm elementlerini List içine atıyorum
         */

        Set<Integer> sinifKeySet = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<Integer>();

        // List atmamızın sebebi index yapısına ulaşmaktı List ile artık bunu destekliyor
        // İlk önce Set yapmamızın sebebi is tekrar varsa onlardan kurtulmak
        keyList.addAll(sinifKeySet); // foreach yapmaya gerek kalmadı
        System.out.println(keyList);

        /*
        Keyleri liste atma alternatifi
        List<Integer> sinifKeyList = new ArrayList<>();
        sinifKeyList.addAll(sinifListMap.keySet());
        System.out.println(sinifKeyList);
         */

        // Şimdi valueleri index ile ulaşabileceğimiz şekle sokalım
        List<String> valueList = new ArrayList<String>();
        valueList.addAll(sinifListMap.values());
        System.out.println(valueList);

        /*
         Her bir Value birden fazla bilgiyi içeriyor
         Bu yüzden valueleri multidimensional bir arraye atmak mantıklı duruyor
         ancak multidimensional array oluşturmak için boyutları bilemeye ihtiyacımız var
         */

        // outer arrayin boyutu valueList.size() kadar bu basit
        int outerArrayBoyut = valueList.size();

        // inner arrayin boyutunu bulmak biraz karışık
        String ilkValue = valueList.get(0);
        System.out.println(ilkValue); // Ali, Can, Dev
        String[] ilkValueArr = ilkValue.split(", ");
        System.out.println(Arrays.toString(ilkValueArr)); // [Ali, Can, Dev]
        int innerArrayBoyut = ilkValueArr.length;

        String[][] valueMDArr = new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i < outerArrayBoyut; i++) {
            String[] temp = valueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDArr[i][j] = temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr)); // [[Ali, Can, Dev], [Veli, Yan, QA], [Ali, Yan, C#]]

        System.out.println();

        // Bu satıra kadar yapılanların özetleri
        // keyleri indexine ulaşabildiğim keyList'e atadım
        // valueleri multidimensionalarray(MDA) atadım
        // şimdi bu key ve valueleri istediğim gibi manipule edebilirim

        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("=========================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "     ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "     ");
            }
            System.out.println();
        }

    }
}
