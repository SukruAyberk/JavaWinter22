package day28_constructor;

public class Deneme {

    public static void swing() {
        System.out.print("swing ");
    }
    public void climb() {
        System.out.println("climb ");
    }
    public static void play() {
        swing();
        //climb();
    }
    public static void main(String[] args) {
        Deneme rope = new Deneme();
        rope.play();
        Deneme rope2 = null;
        rope2.play();
    }
}
