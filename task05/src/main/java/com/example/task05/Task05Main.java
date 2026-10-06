package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5, 4, 3));
    }

    static int getMin(int a, int b, int c) {
        int min = a;
        int max = b;
        if (min > c) min = c;
        if (min > max) return max;
        else return min;
    }
}