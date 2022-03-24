package day17_forLoop;

public class C09_Palindrome {

    public static void main(String[] args) {

        String input = "Madam";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            terstenInput += input.charAt(i);
        }

        System.out.println("Girdiğiniz kelimenin tersten yazılışı: " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)) {
            System.out.println(input + " kelimesi palindrome'dur");
        } else {
            System.out.println(input + " kelimesi palindrome değildir");
        }

    }
}
