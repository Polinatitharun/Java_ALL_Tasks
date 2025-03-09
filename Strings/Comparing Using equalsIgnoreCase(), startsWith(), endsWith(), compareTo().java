import java.util.Scanner;

class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
        System.out.println("Starts with: " + str1.startsWith(str2));
        System.out.println("Ends with: " + str1.endsWith(str2));
        System.out.println("CompareTo: " + str1.compareTo(str2));
    }
}
