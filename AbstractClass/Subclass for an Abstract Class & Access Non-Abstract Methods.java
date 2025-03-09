abstract class AbstractClass {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method");
    }
}

class SubClass extends AbstractClass {
    void abstractMethod() {
        System.out.println("Abstract Method Implemented in SubClass");
    }

    public static void main(String[] args) {
        AbstractClass obj = new SubClass(); // Creating an instance of SubClass
        obj.nonAbstractMethod(); // Accessing non-abstract method
    }
}
