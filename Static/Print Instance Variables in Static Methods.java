import java.util.Scanner;

class Demo {
    int instanceVar1;
    int instanceVar2;

    static void printInstanceVariables(Demo obj) {
        System.out.println("Instance Variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo obj = new Demo();
        System.out.print("Enter instanceVar1: ");
        obj.instanceVar1 = sc.nextInt();
        System.out.print("Enter instanceVar2: ");
        obj.instanceVar2 = sc.nextInt();
        printInstanceVariables(obj);
    }
}
