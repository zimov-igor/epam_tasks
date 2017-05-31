package practice1_matrix;

import java.util.Arrays;

/**
 * Created by PC on 01.11.2016.
 */
public class Matrix {
    private int[][] a;

    public Matrix(int x, int y) {
        a = new int[x][y];
    }

    public int getA(int x, int y) {
        return a[x][y];
    }

    public void setA(int x, int y, int date ) {
        a[x][y] = date;
    }
    public int getHorizontalSIze(){
        return a[0].length;
    }
    public  int getVerticalSize(){
        return a.length;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(a);
    }

}
