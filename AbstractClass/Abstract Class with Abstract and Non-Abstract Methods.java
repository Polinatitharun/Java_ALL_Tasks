abstract class AbstractClass {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method");
    }
}

public class Main {
    public static void main(String[] args) {
        // We cannot create an object of AbstractClass directly
        // AbstractClass obj = new AbstractClass(); // ERROR
    }
}
