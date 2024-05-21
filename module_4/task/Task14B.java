package task;

public class Task14B {
    public static void main(String[] args) {
        Task14A shapeSides = new Task14A();
        int shapeSide = shapeSides.getShape_sides();
        shapeSides.setShape_length(4);
        shapeSides.setShape_breadth(5);
        int length_result = shapeSides.getShape_length();
        int breadth_result = shapeSides.getShape_breadth();
        int area = length_result * breadth_result;
        System.out.println("The area of a sqaure of length:" +  length_result +" and breadth " + breadth_result +" is " + area);

    }
}
