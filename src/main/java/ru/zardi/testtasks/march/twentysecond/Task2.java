package ru.zardi.testtasks.march.twentysecond;

import java.util.Random;

/**
 * Created by Anton Petrov
 * Time: 17:57
 * Date: 2018-03-22.
 */
public class Task2 {
    private final static int n = 5;
    private final static int maxValue = 40;
    private final static String format = "%" + (("" + maxValue).length() + 1) + "d";

    public static void main(String[] args) {
        final int[][] array = new int[n][n];
        final Random random = new Random();

        for (int i = 0; i<n ; i++) {
            for (int j = 0; j<n; j++) {
                array[i][j] = (i == (n-1) && j == (n -1) ) ? maxValue + 1  : random.nextInt(maxValue);

                System.out.print(String.format(format, array[i][j]));
          }
          System.out.println();
        }


        int max = array[0][0];

        for (int i = 0; i<n ; i++) {
            final int limit = n - i;
            for (int j = 0; j< limit; j++) {
                final int currentElement = array[i][j];
                if (currentElement > max) {
                    max = currentElement;
                }
            }
        }

        System.out.println("\nMaximum according the task is " + max);
    }
}
