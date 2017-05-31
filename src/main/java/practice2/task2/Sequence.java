package practice2.task2;


import java.util.Arrays;
import java.util.Scanner;


public class Sequence {
   public static int[] arrayInt() {
       System.out.println("Example: 5,6,8,0,-45...");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(",");
        int[] array = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(array);

        return array;
    }
   public static int max(int[] array){
        return array[array.length - 1];
    }
   public static int min(int[] array){
        return array[0];
    }
   public static double sum(int[] array){
        double sum = 0;
        for (int i:array) {
            sum += (double) i;
        }
        return sum;
    }
   public static int length(int[] array){
        return array.length;
    }
}
