import java.util.Scanner;

class Demo {
    static int staticVar1;
    static int staticVar2;

    void printStaticVariables() {
        System.out.println("Static Variables: " + staticVar1 + ", " + staticVar2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter staticVar1: ");
        staticVar1 = sc.nextInt();
        System.out.print("Enter staticVar2: ");
        staticVar2 = sc.nextInt();
        Demo obj = new Demo();
        obj.printStaticVariables();
    }
}
