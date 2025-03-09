import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int smaller = (a < b) ? a : b;
        int larger = (a > b) ? a : b;

        System.out.println("Smaller Number: " + smaller);
        System.out.println("Larger Number: " + larger);

        sc.close();
    }
}
