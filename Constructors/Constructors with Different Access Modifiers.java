class MyClass {
    private MyClass() {
        System.out.println("Private Constructor Called");
    }

    protected MyClass(int a) {
        System.out.println("Protected Constructor Called with value: " + a);
    }

    public MyClass(String s) {
        System.out.println("Public Constructor Called with value: " + s);
    }

    MyClass(double d) {
        System.out.println("Default Constructor Called with value: " + d);
    }

    public static void main(String[] args) {
        new MyClass(10);
        new MyClass("Hello");
        new MyClass(10.5);
    }
}
