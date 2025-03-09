import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 99 numbers (1 to 100 missing one): ");
        int[] arr = new int[99];
        int totalSum = 5050; 
        int sum = 0;
        for (int i = 0; i < 99; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Missing Number: " + (totalSum - sum));
    }
}
