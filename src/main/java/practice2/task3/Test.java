package practice2.task3;

/**
 * Created by PC on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {
        try {
            int y = Bank.deposit(50000,10,525.5);
            System.out.println(y);
            y = Bank.deposit2(50000,10,80525.5);
            System.out.println(y);
            y = Bank.deposit3(50000,10,80525.5);
            System.out.println(y);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
