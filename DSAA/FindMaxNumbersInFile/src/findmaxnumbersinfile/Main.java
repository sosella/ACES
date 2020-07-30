package findmaxnumbersinfile;

import java.io.*;
import java.util.*;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        writeNumbers("output.txt", 10000000);
        int[] numbers = findMaxNumbers("output.txt", 10);
        orderNumbers(numbers);
        printNumbers(numbers);
    }

    private static void writeNumbers(String fileName, int NUMS) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
            Random ran = new Random();
            for (int i = 0; i < NUMS; i++) {
                out.write(String.valueOf(ran.nextInt()));
                out.newLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static int[] findMaxNumbers(String fileName, int MAX_NUMS) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            int[] numbers = new int[MAX_NUMS];
            for (int i = 0; i < MAX_NUMS; i++) {
                numbers[i] = Integer.MIN_VALUE;
            }
            
            String str;
            while ((str = in.readLine()) != null) {
                int num = Integer.parseInt(str);

                int mini = findIndexOfMinimumNumber(numbers);
                if (num > numbers[mini]) {
                    numbers[mini] = num;
                }
            }

            return numbers;
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    private static int findIndexOfMinimumNumber(int[] numbers) {
        int min = numbers[0];
        int mini = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                mini = i;
            }
        }
        return mini;
    }

    private static void orderNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int max = numbers[i];
            int maxj = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    maxj = j;
                }
            }
            int nbri = numbers[i];
            numbers[i] = numbers[maxj];
            numbers[maxj] = nbri;
        }
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
