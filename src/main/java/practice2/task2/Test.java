package practice2.task2;

/**
 * Created by PC on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        int[] temp = Sequence.arrayInt();

        System.out.println("Quantity " + Sequence.length(temp));
        System.out.println("Min " + Sequence.min(temp));
        System.out.println("Max " + Sequence.max(temp));
        System.out.println("Sum " + Sequence.sum(temp));
        System.out.println("Average " +(Sequence.max(temp)/Sequence.length(temp)) );


    }
}
