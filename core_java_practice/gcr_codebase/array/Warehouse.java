package core_java_practice.gcr_codebase.array;

import java.util.Arrays;
import java.util.HashSet;

public class Warehouse {

    public static void main(String[] args) {

        int[] stock = {10, 20, 15, 20, 30, 10};

        // Max, Min, Total
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int num : stock) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            total += num;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        // Duplicates
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Duplicate Values: ");
        for (int num : stock) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }

        // Rotate Array
        int k = 2;
        rotate(stock, k);

        System.out.println("\nRotated Array:");
        System.out.println(Arrays.toString(stock));

        // 2D Shelf Grid
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nTranspose of Shelf Grid:");
        transpose(shelf);
    }

    static void rotate(int[] arr, int k) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;
        k = ((k % n) + n) % n;

        if (k == 0) {
            return;
        }

        int[] copy = Arrays.copyOf(arr, n);

        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = copy[i];
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}