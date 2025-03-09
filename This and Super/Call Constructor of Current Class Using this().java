class MyClass {
    MyClass() {
        this(100); // Calling another constructor using this()
        System.out.println("Default Constructor Called");
    }

    MyClass(int value) {
        System.out.println("Parameterized Constructor Called with value: " + value);
    }

    public static void main(String[] args) {
        new MyClass();
    }
}
