package day15_methodCreation;

public class C01_MethodCreation {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // str'nin ilk 4 harfini almak istersek
        str.substring(0, 4);

        // Bir program yaparken kodlarımızın daha kısa ve anlaşılabilir olması için sürekli kullanabileceğimiz kod bloklarını
        // hazır olarak bir yere koyar ihtiyacımız oldukça oradan alıp kullanabiliriz

        // Bir işlemi sadece bir kere yapacaksak method kullanmamıza gerek olmayabilir
        // ancak özellikle çok kullanacağımız işlemler için her seferinde yeniden aynı kodları yazmak yerine
        // bu işlemi yapan hazır bir method oluşturmak çok daha pratiktir.

        // Bazen bir class'ın içerisine çok uzun kodlar yazarsak tüm class'ın anlaşılması zorlaşabilir
        // Bunun yerine kodun belli kısımlarını ayrı methodlar olarak oluşturup main method içerisinden
        // istediğimiz şekilde bu methodları yönetebiliriz.

    }

}
