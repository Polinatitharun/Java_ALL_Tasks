import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter value to find: ");
        int value = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                System.out.println("Index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
