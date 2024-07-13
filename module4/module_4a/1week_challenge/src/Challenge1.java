import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your word to be checked: ");
        String word = input.nextLine();
        String trimmedWord = word.toLowerCase().trim();


        StringBuilder reversed = new StringBuilder(new StringBuilder(trimmedWord)).reverse();
        String reversedWord =reversed.toString();
        System.out.println("Original: " + trimmedWord);
        System.out.println("Reversed: " + reversedWord);
        if (trimmedWord.equals(reversedWord)) {
            System.out.println("Yes, " + trimmedWord + " is a palindromes ");
        }else{
            System.out.println(trimmedWord + " is not a palindromes ");
        }
    }
}
