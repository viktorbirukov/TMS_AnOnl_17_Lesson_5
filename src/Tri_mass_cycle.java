import java.util.Scanner;
public class Tri_mass_cycle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Запрос числа из консоли
        System.out.print("Введите число: ");
        int Plus = scanner.nextInt();

        // создание трехмерного массива
        int[][][] threemass = new int[3][3][3];

        // Наполнение массива и увеличение на введенное число
        for (int i = 0; i < threemass.length; i++) {
            for (int j = 0; j < threemass[i].length; j++) {
                for (int k = 0; k < threemass[i][j].length; k++) {
                    // Увеличение каждого элемента массива
                    threemass[i][j][k] += Plus;
                }
            }
        }
        // Вывод трехмерного массива на консоль
        System.out.println("МАССИВ+ " + Plus + ":");
        for (int i = 0; i < threemass.length; i++) {
            for (int j = 0; j < threemass[i].length; j++) {
                for (int k = 0; k < threemass[i][j].length; k++) {
                    System.out.print(threemass[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}