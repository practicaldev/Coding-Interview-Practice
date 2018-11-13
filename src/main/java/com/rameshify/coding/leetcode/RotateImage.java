package com.rameshify.coding.leetcode;

import java.util.Arrays;

/**
 * Leet Code #48: Rotate Image
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/rotate-image">Rotate Image</a>
 */
public class RotateImage {

  public void rotate(int[][] matrix) {
    int length = matrix.length;
    for (int row = 0; row < length / 2; row++) {
      for (int column = row; column < length - row - 1; column++) {
        rotate(matrix, row, column, length);
      }
    }
  }

  private void rotate(int[][] matrix, int i, int j, int length) {
    int holder = matrix[i][j];
    matrix[i][j] = matrix[length - j - 1][i];
    matrix[length - j - 1][i] = matrix[length - i - 1][length - j - 1];
    matrix[length - i - 1][length - j - 1] = matrix[j][length - i - 1];
    matrix[j][length - i - 1] = holder;
  }

  public static void main(String[] args) {
    RotateImage rotateImage = new RotateImage();

    int[][] a = new int[][]{
//            {1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12},
//            {13, 14, 15, 16}
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
    };
    rotateImage.rotate(a);
    for (int i = 0; i < a.length; i++) {
      System.out.println(Arrays.toString(a[i]));
    }
  }
}
