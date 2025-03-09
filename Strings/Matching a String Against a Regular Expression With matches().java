import java.util.Scanner;

class StringMatches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter regex pattern: ");
        String pattern = sc.nextLine();
        System.out.println("Matches: " + str.matches(pattern));
    }
}
