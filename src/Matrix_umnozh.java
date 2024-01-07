import java.util.Arrays;
public class Matrix_umnozh {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] result = main(matrix1,matrix2);

        // Вывод исходных матриц на консоль

        System.out.printf("Матрица №1: %S \n", Arrays.deepToString(matrix1));
        System.out.printf("Матрица №2: %S \n", Arrays.deepToString(matrix2));

        // Вывод полученной матрицы на консоль
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static int[][] main(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];

                }
            }
        }
        return result;
    }
}