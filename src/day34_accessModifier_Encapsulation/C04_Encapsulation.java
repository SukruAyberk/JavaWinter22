package day34_accessModifier_Encapsulation;

public class C04_Encapsulation {

    public static void main(String[] args) {

        /*
        Bir variable'ı encapsule etmek için
            1- Access modifier'ı private yapmalıyız
            2- Getter ve Setter üretmeliyiz
                - Eğer sadece okunmasını istiyorsan getter üretirsin
                - Eğer sadece değer girilsin istiyorsan setter üretirsin
                - Hem okunsun hemde değer girilsin dersen ikisini de üretirsin

         Bir variable için hem getter hem setter oluşturursan
         o variable public olmuş gibi hem okunur hem değiştirilir
         */

        C03 obj = new C03();
        System.out.println(obj.getSayi());

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());

        System.out.println(obj);

    }

}
