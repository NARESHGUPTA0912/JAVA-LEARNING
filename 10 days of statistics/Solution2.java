import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Calculate Q1, Q2, Q3
        int q1 = calculateMedian(arr, 0, n / 2 - 1);
        int q2 = calculateMedian(arr, 0, n - 1);
        int q3 = calculateMedian(arr, (n + 1) / 2, n - 1);

        // Print results
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);

        scanner.close();
    }

    // Helper method to calculate the median
    private static int calculateMedian(int[] arr, int start, int end) {
        int length = end - start + 1;
        int mid = start + length / 2;

        if (length % 2 == 0) {
            // Even: average of two middle values
            return (arr[mid - 1] + arr[mid]) / 2;
        } else {
            // Odd: middle value
            return arr[mid];
        }
    }
}
