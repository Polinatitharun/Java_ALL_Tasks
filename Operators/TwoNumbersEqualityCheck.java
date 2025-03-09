import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Numbers are Equal");
        } else {
            System.out.println("Numbers are Not Equal");
        }

        sc.close();
    }
}
