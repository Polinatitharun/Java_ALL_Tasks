import java.util.Scanner;

class StringValueOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        System.out.println("String Representation: " + str);
    }
}
