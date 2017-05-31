package practice6_String;


import java.util.Map;

 public interface IStringProcessing {
    int quantityOfLetters(String str);
    boolean equalsIgnoreCase(String str, String key);
    String toUpperCase(String str);
    String toLowerCase(String str);
    Map<Integer, String> indexOfString(String str, String key);
    Map<Integer, Integer[]> indexMyOfString(String str, String key);
    String replace(String str, String pattern, String key);
    Map<String, Integer> countSameWords(String str);
}
