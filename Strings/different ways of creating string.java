import java.util.Scanner;

class StringCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArray);
        System.out.print("Enter a string: ");
        String str3 = sc.nextLine();
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
    }
}
