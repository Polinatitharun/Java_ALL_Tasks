import java.util.Scanner;
import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter position to insert: ");
        int index = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();
        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) newArr[i] = value;
            else newArr[i] = arr[j++];
        }
        System.out.println("Updated Array: " + Arrays.toString(newArr));
    }
}
