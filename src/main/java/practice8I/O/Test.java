package practice8I.O;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by PC on 04.12.2016.
 */
public class Test {
    public static void main(String[] args) {
        File file1 = new File("f:/java/1.txt");
        File file2 = new File("f:/java/2.txt");

        String str = FileCompare.fileEquals(file1,file2);
        System.out.println(str);

    }


}
