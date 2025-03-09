interface MyInterface {
    static final int CONSTANT = 500; // Always public, static, and final
    void display();
}

class MyClass implements MyInterface {
    public void display() {
        System.out.println("Static Final Variable: " + CONSTANT);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
