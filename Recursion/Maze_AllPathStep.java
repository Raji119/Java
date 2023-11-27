package Recursion;

import java.util.Arrays;

public class Maze_AllPathStep {

    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int allPath[][] = new int[maze.length][maze[0].length];

        path("", maze, 0, 0, allPath, 1);

    }

    static void path(String p, boolean[][] maze, int r, int c, int[][] allpath, int step) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {

            allpath[r][c] = step;
            for (int[] arr : allpath) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        allpath[r][c] = step;

        if (r < maze.length - 1) {
            path(p + "D", maze, r + 1, c, allpath, step + 1);
        }
        if (c < maze[0].length - 1) {
            path(p + "R", maze, r, c + 1, allpath, step + 1);
        }

        if (r > 0) {
            path(p + "U", maze, r - 1, c, allpath, step + 1);
        }
        if (c > 0) {
            path(p + "L", maze, r, c - 1, allpath, step + 1);
        }

        maze[r][c] = true;
        allpath[r][c] = 0;
    }

}
