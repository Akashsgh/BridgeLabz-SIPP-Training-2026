package core_java_practice.gcr_codebase.scanerioRecursion;

public class SensorReadings {
    public static boolean isIncreasing(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] >= arr[i + 1]) {
            return false;
        }

        return isIncreasing(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 15, 18, 22, 30};
        int[] arr2 = {12, 15, 14, 22};

        System.out.println(isIncreasing(arr1, 0));
        System.out.println(isIncreasing(arr2, 0));
    }

    
}
