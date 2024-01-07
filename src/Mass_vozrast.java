import java.util.Arrays;
public class Mass_vozrast {
    public static void main(String[] args) {
        // Объявление массива
        int[][] TwoMass = { {8, 20, 30}, {42, 5, 64}, {72, 81, 90} };
        System.out.printf("Массив: %S \n", Arrays.deepToString(TwoMass));
        // Проход по каждой строке и сортировка элементов в каждой строке
        for (int i = 0; i < TwoMass.length; i++) {
            Arrays.sort(TwoMass[i]);
        }
        // Вывод отсортированного массива
        System.out.println("РЕЗУЛЬТАТ:");
        for (int i = 0; i < TwoMass.length; i++) {
            for (int j = 0; j < TwoMass.length; j++) {
                System.out.print(TwoMass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
