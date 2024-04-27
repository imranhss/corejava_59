package mathstring59;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls Enter any Word or name");
        String word = input.nextLine().toUpperCase();

        if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
            System.out.println("This word start with Vowel");
        } else {
            System.out.println("This word start with Consonent");

        }

    }

}
