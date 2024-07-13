package task.task17a;

public class LoginPageChild extends LoginPage {
    public static void main(String[] args) {
        LoginPageChild loginPageChild = new LoginPageChild();
        loginPageChild.username();
        loginPageChild.password();
        loginPageChild.forgot_password();
        loginPageChild.signIn();
        loginPageChild.remember_me();
        loginPageChild.continue_homepage();
        loginPageChild.oauth();
    }

    @Override
    public void username() {
        System.out.println("Enter username:");

    }

    @Override
    public void password() {
        System.out.println("Enter password:");

    }

    @Override
    public void forgot_password() {
        System.out.println("Forgot password?");

    }

    @Override
    public void signIn() {
        System.out.println("Sign in");

    }
}
