package practice7_Exeption;

/**
 * Created by PC on 30.11.2016.
 */
public class StackOver {

    void increment(int i){
        if (i < 0) return;
        i += 100;
        increment(i);
    }

    public static void main(String[] args) {
        StackOver stackOver = new StackOver();
        stackOver.increment(10);


    }
}
