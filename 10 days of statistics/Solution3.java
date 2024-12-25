import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        int[] frequencies = new int[n];
        ArrayList<Integer> data = new ArrayList<>();

        // Input values and frequencies
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            frequencies[i] = scanner.nextInt();
        }

        // Expand the data based on frequencies
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < frequencies[i]; j++) {
                data.add(values[i]);
            }
        }

        // Sort the data
        Collections.sort(data);

        // Calculate Q1, Q2, Q3
        int size = data.size();
        double q1 = calculateMedian(data, 0, size / 2 - 1);
        double q3 = calculateMedian(data, (size + 1) / 2, size - 1);

        // Calculate and print the interquartile range
        System.out.printf("%.1f%n", q3 - q1);

        scanner.close();
    }

    // Helper method to calculate the median
    private static double calculateMedian(ArrayList<Integer> data, int start, int end) {
        int length = end - start + 1;
        int mid = start + length / 2;

        if (length % 2 == 0) {
            // Even: average of two middle values
            return (data.get(mid - 1) + data.get(mid)) / 2.0;
        } else {
            // Odd: middle value
            return data.get(mid);
        }
    }
}

