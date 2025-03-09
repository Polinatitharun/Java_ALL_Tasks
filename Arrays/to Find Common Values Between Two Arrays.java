import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class CommonValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements for first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        
        System.out.print("Enter number of elements for second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        Set<Integer> common = new HashSet<>();
        for (int num : arr2) if (set1.contains(num)) common.add(num);
        System.out.println("Common Values: " + common);
    }
}
