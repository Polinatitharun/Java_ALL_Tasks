import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));

        sc.close();
    }
}
