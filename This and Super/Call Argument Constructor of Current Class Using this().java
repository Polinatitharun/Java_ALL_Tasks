class MyClass {
    MyClass() {
        this(42); // Calling parameterized constructor of the same class
        System.out.println("Default Constructor Called");
    }

    MyClass(int value) {
        System.out.println("Parameterized Constructor Called with value: " + value);
    }

    public static void main(String[] args) {
        new MyClass(); // Creating an object to trigger constructor calls
    }
}
