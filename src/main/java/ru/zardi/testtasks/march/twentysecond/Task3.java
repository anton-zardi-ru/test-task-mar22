package ru.zardi.testtasks.march.twentysecond;

/**
 * Created by Anton Petrov
 * Time: 18:13
 * Date: 2018-03-22.
 */
public class Task3 {
    public static void main(String[] args) {
        final int n = 10;
        final int x = 1;
        final int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        print(array);
        print(shift(array, x));
    }

    private static void print(int[] array) {
        for (int anArray : array) {
            System.out.print(" " + anArray);
        }
        System.out.println();
    }

    private static int[] shift(int[] array, int x) {
        final int n = array.length;
        x = x % n;
        if (x == 0 || n<2) {
            return array;
        }
        if (x < 0) {
            x = n + x;
        }
        int[] result = new int[n];

        System.arraycopy(array, n - x, result, 0, x);

        System.arraycopy(array, 0, result, x, n-x);

        return result;
    }
}
