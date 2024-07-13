package task.task19C;

public class ClassB extends ClassA {
    String name = "Tiaraoluwa";

    public static void main(String[] args) {
        ClassB object = new ClassB();
        object.printName();

    }

    public void printName() {
        System.out.println("My parent name is: " + super.name);
    }



}
