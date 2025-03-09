class MyClass {
    // This is not a valid constructor because constructors cannot have a return type.
    int MyClass() {
        System.out.println("This is a method, not a constructor.");
        return 100;
    }

    String MyClass(int x) {
        System.out.println("This is also a method, not a constructor.");
        return "Invalid Constructor";
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.MyClass());
        System.out.println(obj.MyClass(10));
    }
}
