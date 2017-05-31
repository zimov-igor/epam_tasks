package practice1_matrix;

/**
 * Created by PC on 01.11.2016.
 */
public class Test {
    public static void main(String[] args) {
        Matrix matrix1 = MatrixFactory.create(3,3);
        Matrix matrix2 = MatrixFactory.create(3,3);

        System.out.println(matrix1);
        System.out.println(matrix2);



        Matrix res = SumMatrex.sum(matrix1, matrix2);
        System.out.println(res);


    }

}
