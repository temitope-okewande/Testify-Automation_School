package task;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        boolean canConvert = true;
        while (canConvert) {
            String age;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age: ");
            age = scanner.nextLine();
            canConvert = canConvert(age);
            if(!canConvert) {
                System.out.println("This is not a valid age");
                canConvert = true;
            }else {
                System.out.println("Age is " + age);
                break;
            }
        }

    }

    static boolean canConvert(String age) {
        try {
            Integer.parseInt(age);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}

