import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int max = findMax(num1, num2);
        System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + max);
    }

    private static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }
}

