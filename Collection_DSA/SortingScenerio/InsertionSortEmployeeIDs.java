package Collection_DSA.SortingScenerio;

import java.util.Arrays;

public class InsertionSortEmployeeIDs {

    static void insertionSort(int[] employeeIds) {

        int n = employeeIds.length;

        for (int i = 1; i < n; i++) {

            int key = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > key) {

                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = key;

            System.out.println("Pass " + i + " : " + Arrays.toString(employeeIds));
        }
    }

    public static void main(String[] args) {

        int[] employeeIds = {105, 101, 109, 103, 107, 102};

        System.out.println("Original Employee IDs:");
        System.out.println(Arrays.toString(employeeIds));

        System.out.println();

        insertionSort(employeeIds);

        System.out.println();

        System.out.println("Sorted Employee IDs:");
        System.out.println(Arrays.toString(employeeIds));
    }
}