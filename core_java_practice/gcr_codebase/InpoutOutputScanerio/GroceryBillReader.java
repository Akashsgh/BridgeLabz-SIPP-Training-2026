package core_java_practice.gcr_codebase.InpoutOutputScanerio;

import java.io.*;

public class GroceryBillReader {

    public static void main(String[] args) {

        int totalLines = 0;

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("bill.txt"));

            String line;

            System.out.println("Bill Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                totalLines++;
            }

            br.close();

            System.out.println("\nTotal Lines = " + totalLines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}