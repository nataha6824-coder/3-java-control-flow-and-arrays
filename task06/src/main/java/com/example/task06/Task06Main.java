package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3, 4));
    }

    static int getMax(int a, int b, int c, int d) {
        int value1;
        int value2;
        if (a > b) value1 = a;
        else value1 = b;
        if (c > d) value2 = c;
        else value2 = d;
        if (value1 > value2) return value1;
        else return value2;
    }

}