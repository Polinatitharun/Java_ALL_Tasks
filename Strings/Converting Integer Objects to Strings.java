import java.util.Scanner;

class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        Integer num = sc.nextInt();
        String str = num.toString();
        System.out.println("Converted String: " + str);
    }
}
