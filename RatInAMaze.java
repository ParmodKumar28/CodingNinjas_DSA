// Rat In A Maze
// Problem statement
// You are given a N*N maze with a rat placed at maze[0][0]. Find whether any
// path exist that rat can follow to reach its destination i.e. maze[N-1][N-1].
// Rat can move in any direc­tion ( left, right, up and down).

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
// true
// Sample Input 2 :
// 3
// 1 0 1
// 1 0 1
// 0 1 1
// Sample Output 2 :
// false

public class Solution {

    // Helper function to check if path possible
    public static boolean helper(int maze[][], int n, int i, int j, int path[][]) {
        // Checking base case if rat is allowed to move
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        // Checking the path to visited if it's allowed to move
        path[i][j] = 1;

        // If rat reaches to destination
        if (i == n - 1 && j == n - 1) {
            return true;
        }

        // Checking all directions
        // Top
        if (helper(maze, n, i - 1, j, path)) {
            return true;
        }
        // Right
        if (helper(maze, n, i, j + 1, path)) {
            return true;
        }
        // Bottom
        if (helper(maze, n, i + 1, j, path)) {
            return true;
        }
        // Left
        if (helper(maze, n, i, j - 1, path)) {
            return true;
        }

        // Returning false if every case is false
        return false;
    }

    public static boolean ratInAMaze(int maze[][]) {
        int n = maze.length;
        // Creating a path array of same size to mark the path visite which rat visits
        int[][] path = new int[n][n];
        boolean ans = helper(maze, n, 0, 0, path);
        return ans;
    }

}
