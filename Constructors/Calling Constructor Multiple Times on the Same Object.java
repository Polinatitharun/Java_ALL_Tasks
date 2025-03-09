class MyClass {
    MyClass() {
        System.out.println("Constructor Called");
    }

    void callConstructor() {
        new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.callConstructor();
        obj.callConstructor();
    }
}
