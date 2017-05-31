package practice2.task4;

/**
 * Created by PC on 03.11.2016.
 */
public class Triangle {

    public static String lastTriangle(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 5; i++){
            for (int k = 5; (k-i) > 0;) {
                stringBuilder.append("  ");
                k--;
            }
            for (int j = 0; j < i; j++){
                int x = i - j;
                stringBuilder.append(" " + x);
                x--;
            }
            stringBuilder.append("\n");
        }

        return String.valueOf(stringBuilder);
    }

    public static String firstTriangle(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 5; i++){
            int x = i - 1;
            for (int j = 0; j < i; j++){
                stringBuilder.append(" " + x);
                x--;
            }
            stringBuilder.append("\n");
        }
       return String.valueOf(stringBuilder);
    }

    /*public static void main(String[] args) {

        System.out.println(lastTriangle());

        for (int i = 0; i <= 5; i++){
            int x = i - 1;
            for (int j = 0; j < i; j++){
                System.out.print(" " + x);
                x--;
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++){
            for (int k = 5; (k-i) > 0;) {
                System.out.print("  ");
                k--;
            }
            for (int j = 0; j < i; j++){
                int x = i - j;

                System.out.print(" " + x);
                x--;
            }
            System.out.println();
        }

    }*/
}
