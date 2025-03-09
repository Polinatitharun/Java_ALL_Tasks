import java.util.Scanner;

class MyClass {
    MyClass() {
        System.out.println("Default Constructor Called");
    }

    MyClass(int a) {
        System.out.println("One Argument Constructor Called with value: " + a);
    }

    MyClass(int a, String b) {
        System.out.println("Two Argument Constructor Called with values: " + a + " and " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        new MyClass();
        new MyClass(num);
        new MyClass(num, str);
        sc.close();
    }
}
