package day29_staticKeyword;

public class C02_StaticKeyword {

    public static void main(String[] args) {

        // Başka classtaki static class üyelerine ulaşmak istersem
        // önce class simini yazarım sonra üyeyi çağırırım
        System.out.println(C01_Static.okulTelefonu);

        // o değeri bu şekilde değiştirirsem eski değer ölür artık bu değer kalıcı olur
        // yani bu değeri birden fazla kişi değiştirirse en son değiştirenin değeri kalıcı olur
        C01_Static.okulTelefonu = "123456789";
        System.out.println(C01_Static.okulTelefonu);

        // başka classtaki static olmayan class üyelerini çağırmak için o classtan obje üretmeliyiz
        // ve obje ile yapılan atamalar obje için olan değeri değiştirir asıl değeri değiştirmez

        C01_Static obj1 = new C01_Static();
        obj1.staticOlmayanMethod();
        System.out.println(obj1.okulIsmi); // Yildiz Koleji
        obj1.okulIsmi = "Ayberk Koleji";
        System.out.println(obj1.okulIsmi); // Ayberk Koleji
        obj1.id = 15;
        System.out.println(obj1.id);

        C01_Static obj2 = new C01_Static();
        System.out.println(obj2.okulIsmi); // Yildiz Koleji





    }
}
