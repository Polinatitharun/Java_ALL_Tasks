abstract class AbstractClass {
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method");
    }
}

class SubClass extends AbstractClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass(); // Creating an instance of SubClass
        obj.nonAbstractMethod(); // Calling non-abstract method
    }
}
