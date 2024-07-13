package task.task17a;

public abstract class LoginPage {
    public abstract void username();
    public abstract void password();
    public abstract void forgot_password();
    public abstract void signIn();

    public void remember_me() {
        System.out.println("check remember me");

    }
    public void continue_homepage() {
        System.out.println("Click to continue to homepage");

    }
    public void oauth() {
        System.out.println("Click OAuth button");

    }


}
