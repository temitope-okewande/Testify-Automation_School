import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num = input.nextInt();
        if ((num == 2) || (num == 3)) {
            System.out.println(num + " is prime number");
            return;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is prime number");
        }
    }
}
