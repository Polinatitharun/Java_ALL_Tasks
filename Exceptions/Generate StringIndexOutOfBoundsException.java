import java.util.Scanner;

class StringIndexOutExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.charAt(10));
    }
}
