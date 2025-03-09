import java.util.Scanner;

class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter delimiter: ");
        String delimiter = sc.nextLine();
        String[] parts = str.split(delimiter);
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
