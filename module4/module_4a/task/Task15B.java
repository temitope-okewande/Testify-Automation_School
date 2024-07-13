package task;

public class Task15B extends Task15A {
    String gender;
    public static void main(String[] args) {
        Task15B t = new Task15B();
        t.move("Jump");
        t.is_move(true);
        t.action_steps(5);
        t.baby();
        t.baby_gender("boy");

    }


    public void baby() {
        System.out.println("I am born");
    }
    public void baby_gender(String g) {
        gender = g;
        System.out.println("I am a " +  gender);
    }

}
