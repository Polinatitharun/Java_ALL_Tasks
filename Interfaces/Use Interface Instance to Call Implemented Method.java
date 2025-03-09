interface MyInterface {
    void display();
}

class MyClass implements MyInterface {
    public void display() {
        System.out.println("Interface Method Called");
    }

    public static void main(String[] args) {
        MyInterface obj = new MyClass(); // Using interface reference
        obj.display();
    }
}
