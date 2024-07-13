package task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Will you be coming for testify training (Yes/No): ");
        String userInput = scanner.nextLine();
        Task10 task10 = new Task10();
        task10.welcomeNote(userInput);
    }

    public void welcomeNote(String userInput) {

            if (userInput.equalsIgnoreCase("testify")) {
                System.out.println("Welcome to testify training!");

            } else if (userInput.equalsIgnoreCase("yes")) {
                System.out.println("You are welcome to testify training");
            } else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Sorry, you won't be let in to the training");
            } else {
                System.out.println("Wrong input, answer with Yes/No");

            }
            System.out.print("Will you be coming for testify training (Yes/No): ");
            userInput = new Scanner(System.in).nextLine();

    }
}