package day27_constuctor;

public class Cons02 {

    public static void main(String[] args) {

        Cons01 obj1 = new Cons01(); // parametresiz çıktı

        // default constructor devrede çünkü Cons01'de constructor yapmadık
        /*
         Normalde Cons01 classında hiç constructor oluşturmazsak, Java default constructor kullandığından
         obj1'i üretebiliriz.

         Ancak biz parametreli veya parametresiz bir constructor yazdığımızda
         Java default constructor'ı siler.

         Yani parametreli constructor oluşturduğumuzda Cons01 obj1 = new Cons01(); şeklinde obje üretemeyiz
         Bunu düzeltmek için içine ya parametre yazacağız ya da parametresiz constructor üreteceğiz

         Dolayısıyla biz herhangi bir constructor oluşturduğumuzda daha önce başka classlar veya kullanıcıların
         oluşturmuş olabileceği objeleri kullanabilmeleri için default constructor'ın işlevini gerçekleştirecek
         parametresiz bir constructor oluşturmakta fayda var

         Kısaca parametreli bir constructor oluşturursan otomatik olarak parametresizi de oluştur
         */

        Cons01 obj2 = new Cons01("Java");
        // içine Java yazdık ama biz o constructor da stringi işlemediğimiz için
        // parametreli yazdırdı sadece
        // Parametreli constructor için System.out.println(par1); yazınca Java yazdırır

    }
}
