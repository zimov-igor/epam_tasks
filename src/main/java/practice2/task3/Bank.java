package practice2.task3;

/**
 * Created by PC on 03.11.2016.
 */
public class Bank {

    public static int deposit(double money, double percent, double sum) throws Exception {
        if((sum <= money) || (money <= 0) || (percent <= 0) || (sum <= 0)) {
            throw  new Exception("sum <= money");
        }
            int years = 0;
            while ((Math.pow((1 + (percent / 100)), years)) <= (sum / money)) {
                years++;
            }
            return years;
    }

    public static int deposit2(double money, double percent, double sum){
        int years = 0;
        do {
            years++;
        }
        while ((Math.pow((1 + (percent/100)), years)) <= (sum/money));
        return years;
    }
    public static int deposit3(double money, double percent, double sum){
        int years = 0;
        for (;;){
            years++;
            if ((Math.pow((1 + (percent/100)), years)) >= (sum/money))break;
        }

        return years;
    }

}


