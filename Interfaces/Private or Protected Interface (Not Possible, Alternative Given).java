// Interfaces cannot be private or protected in Java. They must be public or package-private.
interface MyInterface {
    int VALUE = 100; // Always public, static, final
    void show();
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Interface Value: " + VALUE);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
