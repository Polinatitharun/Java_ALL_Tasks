import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two boolean values (true/false): ");
        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();

        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT (x): " + (!x));
        System.out.println("Logical NOT (y): " + (!y));

        sc.close();
    }
}
