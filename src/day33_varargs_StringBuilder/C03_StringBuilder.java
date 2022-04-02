package day33_varargs_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java cok guzel");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("sb1 length: " + sb1.length()); // 0, uzunluğu sıfır
        System.out.println("sb1 kapasite: " + sb1.capacity()); // 16, içine 16 karakter alabilir yani 16 tane boşluk var

        System.out.println("sb2 length: " + sb2.length()); // 14, uzunluğu 14
        System.out.println("sb2 kapasite: " + sb2.capacity()); // 30, içine 30 karakter alabilir yani 30-14 tane boşluk var

        System.out.println("sb3 length: " + sb3.length()); // 0, uzunluğu 0
        System.out.println("sb3 kapasite: " + sb3.capacity()); // 10, içine 10 karakter alabilir yani 10 tane boşluk var

        // append method'u ile sb'a ekleme yapabiliriz
        // uzunluk kapasiteyi geçerse kapasite artar
        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println(sb1); // Java cok guzel
        System.out.println("sb1 length: " + sb1.length()); // 14, uzunluğu 14
        System.out.println("sb1 kapasite: " + sb1.capacity()); // 16, içine 16 karakter alabilir yani 2 tane boşluk var

        sb1.append(3);
        System.out.println(sb1); // Java cok guzel3
        sb1.append(true);
        System.out.println(sb1); // Java cok guzel3true

        System.out.println("sb1 length: " + sb1.length()); // 19, uzunluğu 19
        System.out.println("sb1 kapasite: " + sb1.capacity()); // 34, içine 34 karakter alabilir yani 34-19 tane boşluk var

        sb1.append("tum dersler java olsa");
        System.out.println(sb1); // Java cok guzel3truetum dersler java olsa
        System.out.println("sb1 length: " + sb1.length()); // 40, uzunluğu 40
        System.out.println("sb1 kapasite: " + sb1.capacity()); // 70, içine 70 karakter alabilir yani 70-40 tane boşluk var

        // fazla boşluklarla fazla alan tutmamak için kırpıyoruz
        sb1.trimToSize();
        System.out.println("sb1 length: " + sb1.length()); // 40, uzunluğu 40
        System.out.println("sb1 kapasite: " + sb1.capacity()); // 40, içine 40 karakter alabilir yani 0 tane boşluk var

    }
}
