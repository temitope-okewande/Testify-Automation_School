package task;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input for the word to be reversed.
        System.out.print("Enter your unique word: ");
        String name = scanner.nextLine();
        //reverse of the inputted word
        StringBuilder reversed_name = new StringBuilder(name).reverse();
        System.out.println("Reversed string: " + reversed_name.toString());
        // getting a slice word 'come' from  the reversed word 'democracy'
        System.out.println(reversed_name.substring(4,8));
    }

}
