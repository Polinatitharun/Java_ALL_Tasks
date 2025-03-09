import java.util.Scanner;

class Demo {
    static int staticVar1;
    static int staticVar2;
    int instanceVar1;
    int instanceVar2;

    static void staticMethod1() {
        System.out.println("Static Method 1 Called");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2 Called");
    }

    void instanceMethod1() {
        System.out.println("Instance Method 1 Called");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2 Called");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter staticVar1: ");
        staticVar1 = sc.nextInt();
        System.out.print("Enter staticVar2: ");
        staticVar2 = sc.nextInt();
        Demo obj = new Demo();
        System.out.print("Enter instanceVar1: ");
        obj.instanceVar1 = sc.nextInt();
        System.out.print("Enter instanceVar2: ");
        obj.instanceVar2 = sc.nextInt();
        staticMethod1();
        staticMethod2();
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
