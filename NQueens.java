// N Queens
// Hard
// Score
// 600/600
// Average time to solve is 60m
// Problem statement
// You are given N, and for a given N x N chessboard, find a way to place N
// queens such that no queen can attack any other queen on the chess board. A
// queen can be killed when it lies in the same row, or same column, or the same
// diagonal of any of the other queens. You have to print all such
// configurations.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Line 1 : Integer N
// Output Format :
// One Line for every board configuration.
// Every line will have N*N board elements printed row wise and are separated by
// space
// Note : Don't print anything if there isn't any valid configuration.
// Constraints :

// 1<=N<=10 For Example:
// For a chessboard of size 4*4
// The configurations are
// alt text

// Sample Input 1:
// 4
// Sample Output 1 :
// 0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0
// 0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0

public class Solution {

    public static void placeNQueens(int n) {

        /*
         * Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */
        // Creating a n*n board with 0 values
        int[][] board = new int[n][n];
        solve(board, 0, n);

    }

    // Creating solve function to fill all the queens in the board
    public static void solve(int[][] board, int row, int n) {
        // Base case if all queens placed print the board
        if (row == n) {
            printBoard(board, n);
            return;
        }

        // Checking if it's safe to be place queen in this column here
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i, n)) {
                // Placing queen if it's safe
                board[row][i] = 1;

                // Now, visiting to next row after placing queen
                solve(board, row + 1, n);

                // Backtracking if there is no possible column to place queen in this row then
                // replacing previous row queen here.
                board[row][i] = 0;
            }
        }

    }

    // Creating safe function to check if queen placing is safe here
    public static boolean isSafe(int[][] board, int row, int col, int n) {
        // Creating two variables to be used in loops
        int i, j;

        // Checking if any other queens is there in same column
        for (i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Checking for the top left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Checking for the top right diagonal
        for (i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // If all rows and columns are clear then it's safe
        return true;
    }

    // Creating a print function to print the board
    public static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
    }

}
s