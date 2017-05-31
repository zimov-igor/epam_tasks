package practice6_String;

import java.util.*;


public class A {
    public static void main(String[] args) {
        String str = "bot-cot-bot-dot-cot";
        String key = "bot";
        String ww = "wwwwwww";
        String w = "ww";

        StringProcessing s = new StringProcessing();
        System.out.println(s.indexOfString(ww,w));

         Map m = s.indexOfString(str,key);
        System.out.println(m);
        System.out.println(s.countSameWords(str));

        System.out.println(s.indexMyOfString(str, key));

        /*Map m2 = s.indexMyOfString(str, key);
        System.out.println( m2.get(1));
        for (Integer i: ( (Integer[]) m2.get(1))) {
            System.out.println(i);
        }
       Iterator k = m2.values().iterator();
        System.out.println(k.next());*/
    }
}
