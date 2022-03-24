package day11_stringManipulation;

public class C02_Equals {

    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali" + " Can";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

        System.out.println("== ile karşılaştır : " + (str1 == str2)); // true döner
        System.out.println("Equals ile kaşılaştır : " + str1.equals(str2)); // true döner

        System.out.println("------------------------------");

        String str3 = str1 + "";
        System.out.println("str3 : " + str3);
        System.out.println("== ile karşılaştır : " + (str3 == str2)); // false döner
        System.out.println("Equals ile kaşılaştır : " + str3.equals(str2)); // true döner

        // String'de == her zaman doğru sonuç vermez (şimdilik diyoruz bunu ilerde değişecek)
        // bunun için emin olduğumuz equals methodunu kullanmayı tercih ederiz

        System.out.println();

        String str5 = "hasan";
        String str6 = "HASAN";
        System.out.println(str5.equals(str6)); // false döner çünkü String key sensitivedir
        System.out.println(str5.toUpperCase().equals(str6)); // true döner


    }
}
