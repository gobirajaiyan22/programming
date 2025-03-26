package com.learning.programming.ds.matrix.prefixsum;

public class PrefixSumMatrix {
    public static void main(String[] a) {
        int[][] matrix = {
            { 3, 1 },
            { -1, -2 },
            { 2, 4 }
        };
        pfRow(matrix);
        pfColumn(matrix);
        System.out.println("result : " + findSubArraySum(matrix));
    }

    private static int findSubArraySum(int[][] matrix) {
        int sum = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = i; k < row; k++) {
                    for (int l = j; l < col; l++) {
                        sum += matrix[k][l];
                        System.out.println(
                            " i : " + i + " j : " + j + " k : " + k + " l : " + l + " sum : " + sum + " current : " + matrix[k][l]);
                        if (j > 0) {
                            sum -= matrix[k][j - 1];
                        }
                        if (i > 0) {
                            sum -= matrix[i - 1][l];
                        }
                        if (i > 0 && j > 0) {
                            sum += matrix[i - 1][j - 1];
                        }
                    }
                }
            }
        }
        return sum;
    }

    private static void pfRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int pfsum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                pfsum += matrix[i][j];
                matrix[i][j] = pfsum;
            }
        }
    }

    private static void pfColumn(int[][] matrix) {
        for (int i = 0; i < matrix[i].length; i++) {
            int pfsum = 0;
            for (int j = 0; j < matrix.length; j++) {
                pfsum += matrix[j][i];
                matrix[j][i] = pfsum;
            }
        }
    }
}
