package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void abstractMethod();
    /*
     Abstract methodlar child classların mutlaka override etmesi gereken methodlardır
     dolayısıyla hiçbir zaman direkt çalışmazlar
     Bu sebeple method body'sine ihtiyaç yoktur

     Bir class'ın veya methodun abstract olup olmadığını anlayabilir miyimz?
     - abstract yazıyorsa abstractır, yazmıyorsa değildir
     (abstract(soyut) olmayan classlara concrete(somut) class/method denir.)
     */


}
