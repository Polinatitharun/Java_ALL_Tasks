interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default Method Called");
    }
}

class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod();
    }
}
