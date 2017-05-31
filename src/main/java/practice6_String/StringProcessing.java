package practice6_String;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringProcessing implements IStringProcessing {
    @Override
    public int quantityOfLetters(String str) {
        String pattern = "[a-zA-Z]+";
        int quantity = 0;
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        char[] temp = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            m = p.matcher(String.valueOf(temp[i]));
            if (m.matches()) quantity++;
        }

        return quantity;
    }

    @Override
    public boolean equalsIgnoreCase(String str, String key) {
        return str.equalsIgnoreCase(key);
    }

    @Override
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    @Override
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public Map<Integer, String> indexOfString(String str, String key){
        //long before = System.currentTimeMillis();
        long before = System.nanoTime();

        Map<Integer, String> m = new HashMap<>();
        int index = 0 , position = 0;

        while ((str.indexOf(key, position)) >= 0){
            StringBuilder strb = new StringBuilder();
            int temp = str.indexOf(key, position);

            for (int i = 0; i < key.length(); i++){
                strb.append(" ");
                strb.append(temp + i);
            }
            //int strbLength = strb.length();
            m.put(++index, strb.toString());
            position = temp + key.length();
            //strb.delete(0,strbLength + 1);
        }
        long after = System.nanoTime();
        System.out.println("Time : " + (after - before) + "ms.");

        return  m;
    }

    @Override
    public String replace(String str, String pattern, String key) {

        return str.replaceAll(pattern,key);
    }

    @Override
    public Map<String, Integer> countSameWords(String str) {
        String[] strings = str.split("[,;:.!-?\\s]+");
        Map<String, Integer> dictionary = new HashMap<>();

        for (String string : strings) {
            if (dictionary.containsKey(string)){
               Integer temp = dictionary.get(string) + 1;
                dictionary.put(string, temp);
            }
            else {
                dictionary.put(string, 1);
            }
        }
        return dictionary;
    }

    @Override
    public Map<Integer, Integer[]> indexMyOfString(String str, String key) {

        Map<Integer, Integer[]> map = new HashMap<>();
        int index = 0 , position = 0;

        while ((str.indexOf(key, position)) >= 0){
            Integer[] integer = new Integer[key.length()];
            int temp = str.indexOf(key, position);

            for (int i = 0; i < key.length(); i++){
                integer[i] = temp + i;
            }

            map.put(++index, integer);
            position = temp + key.length();
        }
        return  map;
    }
}
