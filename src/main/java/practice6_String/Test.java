package practice6_String;


import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
       // String str = "Lol12 !#222f";
        String str = "bot-cot-bot-dot-cot";
        String key = "bot";


        int[] z = new int[3];

        int num = 0;
       //System.out.println(str.indexOf(key));
        while ((str.indexOf(key, num)) >= 0){
            int temp = str.indexOf(key, num);
            System.out.println(temp);
            num = temp + 3;
        }

        Integer a = 1;
        Integer b = 2;
        Integer[] c = {1,2,3};
        Integer[] v = {4,5,6};

        Map<Integer, Integer[]> test = new HashMap<>();
        test.put(a,c);
        test.put(b,v);

        System.out.println(test);

        /*StringProcessing s = new StringProcessing();

        System.out.println(s.quantityOfLetters(str));
        System.out.println(s.replace(str,"123","www"));*/

    }

    public static Integer[] arrayCreator(int length, int position){
        Integer[] integer = new Integer[length];
        for (int i = 0; i < length; i++){
            integer[i] = position + i;
        }
        return integer;
    }

}


























/*String pattern = "[a-zA-Z]+";
         String text = "codet 2";

       Pattern p = Pattern.compile(pattern);
        Matcher m; // = p.matcher(text);
        int quantity = 0;

        for (int i = 0; i < text.length(); i++){
            char[] temp = text.toCharArray();
            m = p.matcher(String.valueOf(temp[i]));
            if (m.matches()) quantity++;
        }
        System.out.println(quantity);*/