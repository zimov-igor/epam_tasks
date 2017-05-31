package practice8I.O;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 05.12.2016.
 */
public class TestU {
    public static void main(String[] args) {
        File file3 = new File("f:/java/1.txt");
        File file4 = new File("f:/java/2.txt");




        try {
            FileInputStream fis333 = new FileInputStream(file3);
            FileInputStream fis = new FileInputStream(file4);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-16");
            InputStreamReader isr2 = new InputStreamReader(fis333, "UTF-16");

            /*List<Integer> arr = new ArrayList<>();
            List<Integer> arr1 = new ArrayList<>();

            int temp;
            int temp2;
            while ((temp = isr.read()) > 0) arr.add(temp);
            while ((temp2 = isr2.read()) > 0) arr1.add(temp2);


            System.out.println(arr);
            System.out.println(arr1);
*/


            System.out.println(fis333.read());
            System.out.println(isr.read());
            fis.reset();
            System.out.println(fis333.read());
            System.out.println(isr.read());

            System.out.println(fis333.read());
            System.out.println(isr.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
