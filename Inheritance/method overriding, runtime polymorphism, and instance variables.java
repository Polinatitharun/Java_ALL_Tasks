class A {
    int numA = 10;
    
    void methodA1() {
        System.out.println("Method A1 - Specific to Class A");
    }
    
    void methodA2() {
        System.out.println("Method A2 - Specific to Class A");
    }
    
    void show() {
        System.out.println("Show Method in Class A");
    }
}

class B extends A {
    int numB = 20;
    
    void methodB1() {
        System.out.println("Method B1 - Specific to Class B");
    }
    
    void methodB2() {
        System.out.println("Method B2 - Specific to Class B");
    }
    
    @Override
    void show() {
        System.out.println("Show Method in Class B");
    }
}

class C extends B {
    int numC = 30;
    
    void methodC1() {
        System.out.println("Method C1 - Specific to Class C");
    }
    
    void methodC2() {
        System.out.println("Method C2 - Specific to Class C");
    }
    
    @Override
    void show() {
        System.out.println("Show Method in Class C");
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        
        System.out.println("Calling Methods using Individual Objects:");
        objA.methodA1();
        objA.methodA2();
        objA.show();
        
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.show();
        
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.show();
        
        System.out.println("\nCalling Overridden Method using Superclass Reference:");
        A ref1 = new B();
        ref1.show();
        
        A ref2 = new C();
        ref2.show();
        
        System.out.println("\nRuntime Polymorphism with Instance Variables:");
        A refA = new A();
        A refB = new B();
        A refC = new C();
        
        System.out.println("Reference A (numA): " + refA.numA);
        System.out.println("Reference B (numA): " + refB.numA);
        System.out.println("Reference C (numA): " + refC.numA);
    }
}
