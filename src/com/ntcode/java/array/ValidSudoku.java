package com.ntcode.java.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };

        System.out.printf("Is valid sudoku: %b", isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        Set<Character> rowSet;
        Set<Character> colSet;

        //check for rows
        for (char[] chars : board) {
            rowSet = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                if (chars[j] == '.') {
                    continue;
                }
                if (rowSet.contains(chars[j])) {
                    return false;
                }
                rowSet.add(chars[j]);
            }
        }

        //check for cols
        for (int i = 0; i < cols; i++) {
            colSet = new HashSet<>();
            for (char[] chars : board) {
                if (chars[i] == '.') {
                    continue;
                }
                if (colSet.contains(chars[i])) {
                    return false;
                }

                colSet.add(chars[i]);
            }
        }


        //block
        for (int i = 0; i < rows; i = i + 3) {
            for (int j = 0; j < cols; j = j + 3) {
                if (!checkBlock(i, j, board)) {
                    return false;
                }
            }
        }

        return true;

    }

    private static boolean checkBlock(int idxI, int idxJ, char[][] board) {
        Set<Character> blockSet = new HashSet<>();
        int rows = idxI + 3;
        int cols = idxJ + 3;
        for (int i = idxI; i < rows; i++) {
            for (int j = idxJ; j < cols; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (blockSet.contains(board[i][j])) {
                    return false;
                }

                blockSet.add(board[i][j]);
            }
        }

        return true;
    }
}
