package task;

import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        String numberInString = scanner.nextLine();

        double number = Double.parseDouble(numberInString);
        
        if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 ==0 ) {
            System.out.println("Buzz");
        }else if((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("FizzBuzz");
        }else {
            System.out.println(numberInString);
        }


    }
}
