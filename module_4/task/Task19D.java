package task;

public class Task19D {
    String name = "Delta";

    public static void main(String[] args) {
        Task19D task19D = new Task19D();
        task19D.printName("TESTIFY");
    }

    public  void printName(String name) {
        System.out.println("This is my Instance name:" +this.name);
        System.out.println("This is my invoked name:" + name);

    }
}
