class PrivateClass {
    private int privateField = 100;

    private void privateMethod() {
        System.out.println("Private Method Called");
    }

    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
        System.out.println("Private Field: " + obj.privateField);
        obj.privateMethod();
    }
}

class SubClass extends PrivateClass {
    void tryAccessPrivate() {
        // System.out.println(privateField); // ERROR: Cannot access private field
        // privateMethod(); // ERROR: Cannot access private method
    }
}
