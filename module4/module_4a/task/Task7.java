package task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String [] [] my_array = new String [4] [3];
        my_array [0] [0]  = "Mango";
        my_array [1] [0] = "Apple";
        my_array [2] [0]  = "Water Melon";
        my_array [3] [0]  = "Grape";
        System.out.println(Arrays.deepToString(my_array));

    }
}
