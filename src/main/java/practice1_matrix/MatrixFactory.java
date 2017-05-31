package practice1_matrix;

/**
 * Created by PC on 01.11.2016.
 */
public class MatrixFactory {
    public static Matrix create(int horizontal, int vertical){
        Matrix matrix = new Matrix(horizontal, vertical);

        for(int i = 0; i < horizontal; i++){
            for (int k = 0; k < vertical; k++){
                matrix.setA(i, k, (int) (Math.random()* 100));
            }
        }
        return matrix;
    }
}
