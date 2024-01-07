import java.util.Arrays;

public class Diagonal {
    public static void main(String[] args) {
        // Объявление массива
        int[][] TwoMass = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        System.out.printf("Массив: %S \n", Arrays.deepToString(TwoMass));

        // Вывод элементов по диагонали
        System.out.println("Элементы диагонали массива");

        for (int i = 0; i < TwoMass.length; i++) {
            for (int j = 0; j < TwoMass[i].length; j++) {
                // Определение элемента массива по диагонали
                if (i==j) {
                    System.out.print(TwoMass[i][j] + " ");
                }
            }
        }
    }
}
