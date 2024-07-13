package task;

public class Task17Implement implements Task17B{
    public static void main(String[] args) {
        Task17Implement task17 = new Task17Implement();
        task17.correct_password();
        task17.correct_username();
        task17.homepage_login();
    }
    @Override
    public void correct_username() {
        System.out.println("Username is correct");
    }

    @Override
    public void correct_password() {
        System.out.println("Password is correct");

    }

    @Override
    public void homepage_login() {
        System.out.println("Homepage login successful");

    }
}
