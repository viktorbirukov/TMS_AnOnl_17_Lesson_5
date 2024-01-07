public class Chess {
    public static void main(String[] args) {
        char[][] board = new char[8][8];

        // заполнение шахматной доски буквами
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 'W';
                } else {
                    board[i][j] = 'B';
                }
            }
        }
        // Вывод шахматной доски в консоль
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}