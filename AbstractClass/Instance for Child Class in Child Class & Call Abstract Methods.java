abstract class AbstractClass {
    abstract void abstractMethod();
}

class SubClass extends AbstractClass {
    void abstractMethod() {
        System.out.println("Abstract Method Implemented");
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(); // Creating an instance of SubClass
        obj.abstractMethod(); // Calling abstract method
    }
}
