package task.task16b;

public class Child extends Parent {
    public static void main(String[] args) {
        Child house = new Child();
        house.house_type("Bungalow");
        house.flat_numbers(3);
    }
    public  void house_type(String type) {
        System.out.println("The house type is  " + type );
    }
    public  void flat_numbers (int number) {
        System.out.println("The numbers of flat is:  " + number );
    }


}
