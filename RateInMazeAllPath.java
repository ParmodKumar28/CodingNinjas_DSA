// Rat In A Maze All Paths
// Problem statement
// You are given a N*N maze with a rat placed at maze[0][0]. Find and print all
// paths that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat
// can move in any direc­tion ( left, right, up and down).

// Value of every cell in the maze can either be 0 or 1. Cells with value 0 are
// blocked means rat can­not enter into those cells and those with value 1 are
// open.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 0 < N < 11 0 <= Maze[i][j] <=1

// Time Limit: 1sec
// Sample Input 1 :
// 3
// 1 0 1
// 1 0 1
// 1 1 1
// Sample Output 1 :
// 1 0 0 1 0 0 1 1 1
// Sample Output 1 Explanation :
// Only 1 path is possible

// 1 0 0
// 1 0 0
// 1 1 1
// Which is printed from left to right and then top to bottom in one line.

// Sample Input 2 :
// 3
// 1 0 1
// 1 1 1
// 1 1 1
// Sample Output 2 :
// 1 0 0 1 1 1 1 1 1
// 1 0 0 1 0 0 1 1 1
// 1 0 0 1 1 0 0 1 1
// 1 0 0 1 1 1 0 0 1
// Sample Output 2 Explanation :
// 4 paths are possible which are printed in the required format.
/*
	Note:
	To get all the test cases accepted, make recursive calls in following order: Top, Down, Left, Right.
	This means that if the current cell is (x, y), then order of calls should be: top cell (x-1, y), 
	down cell (x+1, y), left cell (x, y-1) and right cell (x, y+1).
*/

public class Solution {

    public static void printMaze(int maze[][], int n, int i, int j, int path[][]) {
        // Checking is allowed to move or not here
        if (i < 0 || j < 0 || j >= n || i >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        // Include current cell in path when rat allows to move
        path[i][j] = 1;

        // If it reachs the destination here
        if (i == n - 1 && j == n - 1) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        // Move in all directions
        // Top
        printMaze(maze, n, i - 1, j, path);
        // Right
        printMaze(maze, n, i, j + 1, path);
        // Down
        printMaze(maze, n, i + 1, j, path);
        // Left
        printMaze(maze, n, i, j - 1, path);

        path[i][j] = 0;
    }

    static void ratInAMaze(int maze[][], int n) {
        /*
         * Your class should be named Solution.
         * Write your code here
         */
        int path[][] = new int[n][n];
        printMaze(maze, n, 0, 0, path);
    }

}