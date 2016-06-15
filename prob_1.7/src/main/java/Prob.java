public class Prob {

    public static int[][] input(int[][] input) {

        int height = input.length;
        int width = input[0].length;

        boolean[] rows = new boolean[height];
        boolean[] cols = new boolean[width];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (input[row][col] == 0) {
                    rows[row] = true;
                    cols[col] = true;
                }
            }
        }


        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (rows[row] || cols[col]) {
                    input[row][col] = 0;
                }
            }
        }


        return input;
    }

}
