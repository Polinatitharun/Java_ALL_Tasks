import java.util.Scanner;

class NumberFormatExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int num = Integer.parseInt(input);
        System.out.println(num);
    }
}
