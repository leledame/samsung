public class Main {
    public static void main(String[] args) {
        int size = 3;
        String[] board = new String[size * size];

        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                int index = (y - 1) * size + x - 1;
                board[index] = " ";
            }
        }
        System.out.println(board);
    }
}
