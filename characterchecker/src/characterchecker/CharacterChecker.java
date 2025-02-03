package characterchecker;

import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check the type of character
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }

        scanner.close();
    }
}
