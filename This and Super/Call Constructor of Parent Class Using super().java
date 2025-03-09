class Parent {
    Parent() {
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the constructor of the parent class
        System.out.println("Child Constructor Called");
    }

    public static void main(String[] args) {
        new Child(); // Creating an object of Child class
    }
}
