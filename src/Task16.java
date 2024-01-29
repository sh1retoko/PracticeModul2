public class Task16 {
    public static void main(String[] args) {
        int[][] tabUmn = new int[9][9];

        for (int row = 0; row < tabUmn.length; row++) {
            for (int col = 0; col < tabUmn.length; col++) {

                tabUmn[row][col] = (row + 1) * (col + 1);

                System.out.printf("%4d", tabUmn[row][col]);
            }

            System.out.println();
        }
    }
}
