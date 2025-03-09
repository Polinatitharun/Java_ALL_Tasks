interface Interface1 {
    void commonMethod();
}

interface Interface2 {
    void commonMethod();
}

class MyClass implements Interface1, Interface2 {
    public void commonMethod() {
        System.out.println("Common Method Implemented");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.commonMethod();
    }
}
