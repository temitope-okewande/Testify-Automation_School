package task;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Welcome to Temitope's  Simple Interest Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your principal amount:");
        double principal = scanner.nextDouble();
        System.out.println("Please input your interest rate in percent:");
        double rate = scanner.nextDouble();
        System.out.println("Please input the number of years:");
        double time = scanner.nextDouble();
        double  simple_interest = (principal * rate * time)/100;

        System.out.println("Your simple interest value  is: " + simple_interest);
    }
}
