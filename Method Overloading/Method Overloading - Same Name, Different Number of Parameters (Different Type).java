class MethodOverload {
    void show(int a) {
        System.out.println("Method with integer parameter: " + a);
    }

    void show(String str) {
        System.out.println("Method with string parameter: " + str);
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.show(10);
        obj.show("Hello");
    }
}
