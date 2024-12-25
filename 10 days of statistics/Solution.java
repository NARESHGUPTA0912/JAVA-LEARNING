import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        double sum = 0;

        // Input array elements and calculate the sum
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Calculate mean
        double mean = sum / n;

        // Calculate squared differences from the mean
        double squaredDifferencesSum = 0;
        for (int i = 0; i < n; i++) {
            squaredDifferencesSum += Math.pow(arr[i] - mean, 2);
        }

        // Calculate standard deviation
        double standardDeviation = Math.sqrt(squaredDifferencesSum / n);

        // Print result
        System.out.printf("%.1f%n", standardDeviation);

        scanner.close();
    }
}
