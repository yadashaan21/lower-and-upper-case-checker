package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        String validUserId = "shaan";
        String validPassword = "shaan123";


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (userId.equals(validUserId) && password.equals(validPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid User ID or Password. Please try again.");
        }

        scanner.close();
    }
}
