package lowerorupper;

import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is in lower case or upper case
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is in Lower Case.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is in Upper Case.");
        } else {
            System.out.println(ch + " is not an Alphabet.");
        }

        scanner.close();
    }
}
