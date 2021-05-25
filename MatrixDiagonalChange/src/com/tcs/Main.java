package com.tcs;
import java.io.*;

class Main {
    static int N = 3;

    static void reverseDiagonal(int array[][]) {
        int i = 0, j = N;
        int temp = 0;
        if (i < j) {

            temp = array[i][i];
            array[i][i] = array[j - 1][j - 1];
            array[j - 1][j - 1] = temp;


            temp = array[i][j - 1];
            array[i][j - 1] = array[j - 1][i];
            array[j - 1][i] = temp;

            i++;
            j--;
        }
        sqrt(array, N);

    }


    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        reverseDiagonal(matrix);
    }


    public static void sqrt(int[][] array, int N) {
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (i != j && i != N - j - 1) {
                    array[i][j] = array[i][j] * array[i][j];

                }
            }

        }
        for (i = 0; i < N; ++i) {
            for (j = 0; j < N; ++j)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}