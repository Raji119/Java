package LeetCode;

public class L2482DiffBtwnOneZero {
    public int[][] onesMinusZeros(int[][] grid) {

        int[][] diff = new int[grid.length][grid[0].length];
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            row[i] = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row[i]++;

                }
            }
        }

        for (int i = 0; i < grid[0].length; i++) {
            col[i] = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 1) {
                    col[i]++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                diff[i][j] = row[i] + col[j] - (grid.length - row[i]) - (grid[0].length - col[j]);
            }
        }

        return diff;

    }

}
