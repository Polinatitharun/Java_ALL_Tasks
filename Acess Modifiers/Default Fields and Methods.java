//(Accessible within the same package)
class DefaultClass {
    int defaultField = 200;

    void defaultMethod() {
        System.out.println("Default Method Called");
    }
}

// Default members are accessible within the same package.



public class AccessDefault {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        System.out.println("Default Field: " + obj.defaultField);
        obj.defaultMethod();
    }
}
