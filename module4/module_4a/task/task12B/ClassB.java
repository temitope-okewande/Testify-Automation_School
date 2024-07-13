package task.task12B;

import task.task12A.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.something();
        ClassB classB = new ClassB();
        classB.anything();


    }
    private void anything(){
        System.out.println("This is a class B");
    }

}
