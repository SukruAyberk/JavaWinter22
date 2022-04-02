package day34_deneme;

import day34_accessModifier_Encapsulation.C01;

public class DenemeChild extends C01 {
    // C01 classındaki parametresiz cons'u protected yapınca erişebildik

    public static void main(String[] args) {

        // normalde class adı yazmalıydık
        // extends ettiğimiz için gerek kalmadı
        // çünkü artık parent-child oldular

        System.out.println(halkaAcikSayi);
        halkaAcikSayi = 30;

        // access modifier'ı protected olduğu için
        // başka paketten class ismi yazarak erişebildik
        C01.aileyeOzel = 25;

    }

}
