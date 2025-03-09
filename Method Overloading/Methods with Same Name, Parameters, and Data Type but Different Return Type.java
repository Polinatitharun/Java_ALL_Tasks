class MethodOverload {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        System.out.println(obj.sum(10, 20));  
    }
}
