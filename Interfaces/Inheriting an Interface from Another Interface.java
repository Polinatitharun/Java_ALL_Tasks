interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent Method Implemented");
    }

    public void childMethod() {
        System.out.println("Child Method Implemented");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
