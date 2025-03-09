import java.util.Scanner;

class Demo {
    static int staticVar1;
    static int staticVar2;
    int instanceVar1;
    int instanceVar2;

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
        System.out.println("Static Variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance Variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }
}
