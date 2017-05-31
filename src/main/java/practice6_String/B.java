package practice6_String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PC on 25.11.2016.
 */
public class B {
    public static void main(String[] args) {
        String str = "bot-cot-bot-dot-cot";
        String key = "bot";

        //List l = new ArrayList();
        Map<Integer, String> m = new HashMap<>();
        System.out.println(m);
        int index = 0 , position = 0;
        //StringBuilder strb = new StringBuilder();

        while ((str.indexOf(key, position)) >= 0){
            StringBuilder strb = new StringBuilder();
            int temp = str.indexOf(key, position);

            for (int i = 0; i < key.length(); i++){

                strb.append(temp + i);
                strb.append(" ");
            }
           System.out.println(strb);
            //int end = strb.length();
            //l.add(index, strb);
            m.put(++index,strb.toString());
            position = temp + key.length();
            //index++;
            //strb.delete(0,end);
            System.out.println(strb);
        }
        System.out.println(m);
        //System.out.println(l);
    }


}
