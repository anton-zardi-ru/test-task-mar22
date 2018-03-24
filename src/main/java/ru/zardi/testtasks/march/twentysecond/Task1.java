package ru.zardi.testtasks.march.twentysecond;

/**
 * Created by Anton Petrov
 * Time: 17:52
 * Date: 2018-03-22.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 27;
        int b = 15;

        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
