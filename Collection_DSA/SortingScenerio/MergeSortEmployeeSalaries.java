package Collection_DSA.SortingScenerio;

import java.util.Arrays;

public class MergeSortEmployeeSalaries {

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);

            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {

                arr[k] = leftArray[i];
                i++;

            } else {

                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {

            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {

            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] salaries = {45000, 32000, 78000, 55000, 40000, 60000};

        System.out.println("Original Salaries:");

        System.out.println(Arrays.toString(salaries));

        mergeSort(salaries, 0, salaries.length - 1);

        System.out.println("Sorted Salaries:");

        System.out.println(Arrays.toString(salaries));
    }
}
