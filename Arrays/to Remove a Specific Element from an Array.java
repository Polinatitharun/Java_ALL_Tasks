import java.util.Scanner;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter element to remove: ");
        int value = sc.nextInt();
        arr = Arrays.stream(arr).filter(num -> num != value).toArray();
        System.out.println("Updated Array: " + Arrays.toString(arr));
    }
}
