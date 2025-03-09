class MyClass {
    int value = 10;

    void display() {
        System.out.println("Value: " + this.value); // Using 'this' to refer to the current class instance variable
    }

    public static void main(String[] args) {
        new MyClass().display(); // No explicit object creation
    }
}
