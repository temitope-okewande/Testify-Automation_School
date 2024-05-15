package task;

public class task4 {
    public static void main(String[] args) {
        //Calculate area of a circle
        double pie = 3.142;
        int radius = 3;
        double radius_square = Math.pow(radius, 2);
        double area = pie * radius_square;
        char unit = 'm';
        System.out.println("The area of the circle is: " +area+ unit);
    }
}
