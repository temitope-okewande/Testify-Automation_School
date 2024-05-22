package task;

public class Task16A {

    //1. Overriding by number
    public void fruits(String type){
        System.out.println("My fruit is "+type);

    }
    //Overriding by datatypes
    public void fruits(String type, int num){
        System.out.println("I have "+num+" fruits");

    }
   // Overriding by position
    public void fruits(int num, String type){
        System.out.println("I have "+num+" fruits");

    }




}
