import java.util.Scanner;

class StringIndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a substring to find: ");
        String sub = sc.nextLine();
        System.out.println("Index: " + str.indexOf(sub));
    }
}
