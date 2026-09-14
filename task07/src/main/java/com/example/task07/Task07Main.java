package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {

        int[] myArray = new int[4];
        myArray[0] = 2;
        myArray[1] = 10;
        myArray[2] = 10;
        myArray[3] = 0;
        System.out.println(sum(myArray));

    }

    static int sum(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

}