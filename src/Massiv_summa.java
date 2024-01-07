public class Massiv_summa {
    public static void main(String[] args) {
        // Объявление массива
        int[][] TwoMass = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Сумма элементов массива
        int summ = 0;

        //Цикл суммирования массива
        for (int i = 0; i < TwoMass.length; i++) {
            for (int j = 0; j < TwoMass[i].length; j++) {
                summ += TwoMass[i][j];
            }
        }
        // Вывод результата
        System.out.println("Сумма элементов двумерного массива: " + summ);
    }
}
