package JUnitJavaTest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import practice6_String.IStringProcessing;
import practice6_String.StringProcessing;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 26.12.2016.
 */
public class StringTest {
    IStringProcessing strProces;
    String str = "bot-cot-bot-dot-cot";
    String key = "bot";
    Map<String,Integer> map = new HashMap<>();



    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before StringTest.class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After StringTest.class");
    }

    @Before
    public void setUp() throws Exception {
        strProces = new StringProcessing();
        map.put("bot",2);
        map.put("cot",2);
        map.put("dot",1);
        System.out.println(map);
    }

    @Test
    public void quantityOfLettersTest() throws Exception {
        assertEquals(15, strProces.quantityOfLetters(str));
    }
    @Test
    public void quantityOfLettersTest2() throws Exception {
        assertEquals(0, strProces.quantityOfLetters(""));
    }

    @Test
    public void equalsIgnoreCaseTest() throws Exception {
        assertEquals(true, strProces.equalsIgnoreCase("STR","stR"));

    }

    @Test
    public void toUpperCaseTest() throws Exception {
        assertEquals("STRING", strProces.toUpperCase("sTRing"));
    }
    @Test
    public void toLowerCaseTest() throws Exception {
        assertEquals("string", strProces.toLowerCase("STRING"));
    }

    @Test
    public void countSameWordsTest() throws Exception {
        assertEquals(map, strProces.countSameWords(str));
    }
}
