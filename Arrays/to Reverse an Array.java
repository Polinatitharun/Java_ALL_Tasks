import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) reversed[i] = arr[n - 1 - i];
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
    }
}
