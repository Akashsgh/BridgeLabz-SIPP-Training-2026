package Collection_DSA.SortingScenerio;

import java.util.Arrays;

public class SortingScenario {

    static int bubbleSort(int[] arr) {

        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                System.out.println("Array already sorted (Best Case)");
                break;
            }
        }

        return swaps;
    }

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Insertion Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    static void top3(int[] arr) {

        int[] temp = arr.clone();

        Arrays.sort(temp);

        System.out.println("\nTop 3 Medalists");

        System.out.println("Gold   : " + temp[temp.length - 1]);
        System.out.println("Silver : " + temp[temp.length - 2]);
        System.out.println("Bronze : " + temp[temp.length - 3]);
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        int[] bubble = scores.clone();

        System.out.println("Bubble Sort");

        int swaps = bubbleSort(bubble);

        System.out.println("\nSorted Array");

        System.out.println(Arrays.toString(bubble));

        System.out.println("Total Swaps = " + swaps);

        System.out.println();

        int[] insertion = scores.clone();

        System.out.println("Insertion Sort");

        insertionSort(insertion);

        System.out.println();

        top3(bubble);
    }
}
