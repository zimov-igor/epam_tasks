package practice2.task1;

/**
 * Created by PC on 02.11.2016.
 */
public class QuantityNum {

    public static int quantity(int number, int key){
        int qun = 0;
        String str = Integer.toString(number);

        if (number > 0){
            for(int i=0;i< str.length();i++) {
                int x = Character.getNumericValue(str.charAt(i));
                if (x == key) qun++;
            }
        }
        return qun;
    }
    public static int quantity2(int number, int key){
        int qun = 0;
        while (number > 0){
            if(number % 10 == key) qun++;
            number /= 10;
        }
        return qun;
    }

}
