class Parent {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // Calls parent class method
        System.out.println("Child Method");
    }

    void display() {
        this.show(); // Calls the current class method
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
