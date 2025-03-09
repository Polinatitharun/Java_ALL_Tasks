import java.util.Scanner;

public class ContainsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter value to check: ");
        int value = sc.nextInt();
        for (int num : arr) {
            if (num == value) {
                System.out.println("Value exists in array");
                return;
            }
        }
        System.out.println("Value not found");
    }
}
