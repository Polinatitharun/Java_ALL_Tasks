import java.util.Scanner;
import java.util.Arrays;

public class ContainsTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        boolean contains12 = Arrays.stream(arr).anyMatch(num -> num == 12);
        boolean contains23 = Arrays.stream(arr).anyMatch(num -> num == 23);
        System.out.println("Contains 12 and 23: " + (contains12 && contains23));
    }
}
