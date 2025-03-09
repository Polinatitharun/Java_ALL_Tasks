import java.util.Scanner;

public class OddEvenInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();

        System.out.println("Even numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
