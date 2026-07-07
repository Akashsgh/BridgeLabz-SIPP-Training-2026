public class SelectionSort {

    static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 2, 1};

        selectionSort(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
}