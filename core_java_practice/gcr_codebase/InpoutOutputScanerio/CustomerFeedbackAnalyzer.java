package core_java_practice.gcr_codebase.InpoutOutputScanerio;

import java.io.*;
import java.util.Scanner;

public class CustomerFeedbackAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("feedback.txt"));

            System.out.println("Enter 5 feedback messages:");

            for (int i = 1; i <= 5; i++) {
                bw.write(sc.nextLine());
                bw.newLine();
            }

            bw.close();

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("feedback.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {

                if (line.toLowerCase().contains("good")) {
                    count++;
                }
            }

            br.close();

            System.out.println("Good Feedback Count = " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
