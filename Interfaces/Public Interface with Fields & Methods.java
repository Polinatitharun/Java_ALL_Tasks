interface MyInterface {
    int VALUE = 100; // Fields are public, static, and final by default
    void display();
}

class MyClass implements MyInterface {
    public void display() {
        System.out.println("Interface Value: " + VALUE);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
