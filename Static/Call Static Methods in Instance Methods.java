class Demo {
    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    void instanceMethod() {
        System.out.println("Instance Method Called");
        staticMethod();
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.instanceMethod();
    }
}
