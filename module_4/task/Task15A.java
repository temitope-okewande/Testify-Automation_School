package task;

public class Task15A {
    String action;
    boolean fact;
    int steps;

    public void move(String a){
        action = a;
        System.out.println("I am going to " +  action);
    }

    public void is_move(boolean f){
        fact = f;
        System.out.println("My action is " + fact);
    }

    public void action_steps(int s){
        steps = s;
        System.out.println("I took " + steps + " steps");}
}
