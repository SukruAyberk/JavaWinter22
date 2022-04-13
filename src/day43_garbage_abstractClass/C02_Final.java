package day43_garbage_abstractClass;

public class C02_Final extends C01_Final {

    public static void main(String[] args) {

        System.out.println(C01_Final.piSayisi);
        System.out.println(C01_Final.okulIsmi);

    }

        /*
        Override Parent classdaki methodu child classa uyarlamak demekti
        yani islevini değiştirmek istiyoruz
        ancak parent classdaki method final olarak tanımlandığından
        Java methodun uyarlanmasına izin vermiyor yani
        Final variable değişmez
        Final method override edilemez
        Final class inheritance(extends) edilemez
         */


}
