import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
    }
}
