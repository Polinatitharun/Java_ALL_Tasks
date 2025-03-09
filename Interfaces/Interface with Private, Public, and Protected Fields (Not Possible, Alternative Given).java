interface MyInterface {
    int PUBLIC_VALUE = 100; // Only public static final fields are allowed
    // private int PRIVATE_VALUE = 50; // Not allowed
    // protected int PROTECTED_VALUE = 30; // Not allowed

    void display();
}

class MyClass implements MyInterface {
    public void display() {
        System.out.println("Public Interface Field: " + PUBLIC_VALUE);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
