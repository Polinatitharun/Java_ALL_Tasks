import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int secondLargest = arr[n - 2];
        System.out.println("Second Largest Number: " + secondLargest);
    }
}
