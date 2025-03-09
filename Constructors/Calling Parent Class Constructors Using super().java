import java.util.Scanner;

class Parent {
    Parent() {
        System.out.println("Parent Default Constructor Called");
    }

    Parent(int a) {
        System.out.println("Parent Argument Constructor Called with value: " + a);
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Default Constructor Called");
    }

    Child(int a) {
        super(a);
        System.out.println("Child Argument Constructor Called with value: " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        new Child();
        new Child(num);
        sc.close();
    }
}
