class Parent {
    int value = 50;
}

class Child extends Parent {
    int value = 100;

    void display() {
        System.out.println("Parent Value: " + super.value); // Using 'super' to access parent class variable
    }

    public static void main(String[] args) {
        new Child().display();
    }
}
