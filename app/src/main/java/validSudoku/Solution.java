package validSudoku;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        var squareControl = 0;
        var square = new HashMap<Integer,HashSet<Character>>();
        var lines = new HashSet<Character>();
        var columns = new HashSet<Character>();
        for(int i = 0; i < board.length; i++) {
            lines.clear();
            columns.clear();
            for (int j = 0; j < board.length; j++) {
                var actualLine = board[i][j];
                var actualColumn = board[j][i];

                if (lines.contains(actualLine)) return false;
                if (actualLine != '.') {
                    lines.add(actualLine);
                }

                if (columns.contains(actualColumn)) return false;
                if (actualColumn != '.') {
                    columns.add(actualColumn);
                }

                if (i / 3 != squareControl) {
                    squareControl = i / 3;
                    square.clear();
                }
                var squareKey = j / 3;
                square.putIfAbsent(squareKey, new HashSet<>());
                var actual = board[i][j];
                if (actual != '.') {
                    if (square.get(squareKey).contains(actual)) return false;
                    square.get(squareKey).add(board[i][j]);
                }
            }
        }
        return true;
    }

    public boolean isValidSudokuV2(char[][] board) {
        // Check each row
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
            }
        }

        // Check each column
        for (int j = 0; j < 9; j++) {
            HashSet<Character> col = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.' && !col.add(board[i][j]))
                    return false;
            }
        }

        // Check each sub-box
        for (int box = 0; box < 9; box++) {
            HashSet<Character> subBox = new HashSet<>();
            int x = (box / 3) * 3;
            int y = (box % 3) * 3;
            for (int i = x; i < x + 3; i++) {
                for (int j = y; j < y + 3; j++) {
                    if (board[i][j] != '.' && !subBox.add(board[i][j]))
                        return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudokuV3(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] grid = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int n = board[i][j] - '1';
                    int g = i / 3 * 3 + j / 3;
                    if (row[i][n] || col[j][n] || grid[g][n]) {
                        return false;
                    }
                    row[i][n] = col[j][n] = grid[g][n] = true;
                }
            }
        }
        return true;
    }

}
