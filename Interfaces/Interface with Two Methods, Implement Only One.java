interface MyInterface {
    void method1();
    void method2(); // Not implemented
}

class MyClass implements MyInterface {
    public void method1() {
        System.out.println("Method1 Implemented");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
    }
}
