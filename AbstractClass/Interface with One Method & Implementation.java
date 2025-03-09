interface MyInterface {
    void show();
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Interface Method Implemented");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
