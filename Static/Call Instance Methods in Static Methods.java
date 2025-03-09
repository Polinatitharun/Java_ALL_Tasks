import java.util.Scanner;

class Demo {
    void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    static void callInstanceMethod(Demo obj) {
        obj.instanceMethod();
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        callInstanceMethod(obj);
    }
}
