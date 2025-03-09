class MethodOverload {
    void calculate(int a) {
        System.out.println("Method with integer: " + a);
    }

    void calculate(double a) {
        System.out.println("Method with double: " + a);
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.calculate(10);
        obj.calculate(10.5);
    }
}
