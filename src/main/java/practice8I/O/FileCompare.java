package practice8I.O;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileCompare {
    public static String fileEquals(File file1, File file2){
        StringBuilder str = new StringBuilder();
        try {
           if((quantityDifferentByte(file1, file2) == 0) && (sizeOfFileEquals(file1, file2)) ){
               str.append("Files == ");
           }
           if ((quantityDifferentByte(file1, file2) != 0 || !(sizeOfFileEquals(file1, file2)))){
               str.append(sizeOfFiles(file1, file2));
               str.append("\n");
               str.append("First difference: ").append(firstDifferentByte(file1, file2)).append("\n");
               str.append("Quantity of difference: ").append(quantityDifferentByte(file1, file2));
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static String sizeOfFiles(File file1, File file2) throws IOException {
        FileInputStream f1 = new FileInputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);
        return "Size file1: " + f1.available() + " byte" + "\n"
                + "Size file2: " + f2.available() + " byte";
    }
    public static boolean sizeOfFileEquals(File file1, File file2){
        FileInputStream f1 = null;
        FileInputStream f2 = null;
        boolean temp = false;
        try {
            f1 = new FileInputStream(file1);
            f2 = new FileInputStream(file2);
            temp = f1.available() == f2.available();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (f1 != null) f1.close();
                if (f2 != null) f2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return temp;
        }

    }

    public static int firstDifferentByte(File file1, File file2) throws IOException{
        FileInputStream f1 = new FileInputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);
        int sizeTemp = f1.available();
        int i, j, first = 0;
        while(( i = f1.read()) > 0 && (j = f2.read()) > 0 && i == j ){
            first++;
        }
        first++;
        if(sizeTemp < first) first = 0;

        return first;
    }
    public static int quantityDifferentByte(File file1, File file2) throws IOException{
        FileInputStream f1 = new FileInputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);
        int i, j, quantity = 0;
        while((i = f1.read()) > 0 && (j = f2.read()) > 0){
            //System.out.println(j + i);
            if(i != j) quantity++;
        }

        return quantity;
    }
}
