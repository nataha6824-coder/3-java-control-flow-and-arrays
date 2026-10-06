package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int idMin = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idMin]) idMin = j;
            }
            if (idMin != i) {
                int temp = arr[i];
                arr[i] = arr[idMin];
                arr[idMin] = temp;
            }
        }

    }
}