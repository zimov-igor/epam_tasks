package practice1_matrix;

/**
 * Created by PC on 01.11.2016.
 */
public class SumMatrex  {
    public static Matrix sum(Matrix a, Matrix b) {
        Matrix c = new Matrix(a.getHorizontalSIze(), a.getVerticalSize());


        if(a.getHorizontalSIze() != b.getHorizontalSIze() ||
                a.getVerticalSize() != b.getVerticalSize()) {
            throw new IllegalArgumentException("Different size");
        }

            int date;
            for (int i = 0; i < a.getHorizontalSIze(); i++){
                for (int k = 0; k < a.getVerticalSize(); k++){
                     date = a.getA(i,k) + b.getA(i,k);
                    c.setA(i, k, date);
                }

            }

        return c;


    }
}
