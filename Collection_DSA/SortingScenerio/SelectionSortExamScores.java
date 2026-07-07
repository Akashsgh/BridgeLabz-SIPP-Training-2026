package Collection_DSA.SortingScenerio;

import java.util.Arrays;

public class SelectionSortExamScores {

    static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;

            System.out.println("Pass " + (i + 1) + " : " + Arrays.toString(scores));
        }
    }

    public static void main(String[] args) {

        int[] scores = {78, 45, 98, 62, 81, 55};

        System.out.println("Original Exam Scores:");
        System.out.println(Arrays.toString(scores));

        System.out.println();

        selectionSort(scores);

        System.out.println();

        System.out.println("Sorted Exam Scores:");
        System.out.println(Arrays.toString(scores));
    }
}
