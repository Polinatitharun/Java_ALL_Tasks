import java.util.Scanner;

class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to replace: ");
        String oldChar = sc.next();
        System.out.print("Enter new character: ");
        String newChar = sc.next();
        System.out.println("Replaced String: " + str.replace(oldChar, newChar));
    }
}
