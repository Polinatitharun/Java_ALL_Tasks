class MethodOverload {
    void print(int a) {
        System.out.println("Method 1 with integer: " + a);
    }

    void print(int b) {
        System.out.println("Method 2 with integer: " + b);
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.print(10);
    }
}
//This won't compile because Java doesn't allow same method signature even if the method logic is different.