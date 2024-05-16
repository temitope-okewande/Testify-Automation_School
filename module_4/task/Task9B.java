package task;

import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equalsIgnoreCase("testify")) {
            System.out.print("Enter a word (type 'testify' to stop): ");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("testify")) {
                System.out.println("Try again");
            }
        }

        System.out.println("Program ended");
    }
}
