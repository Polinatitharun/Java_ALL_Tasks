//(a) Access in Same Package
class ProtectedClass {
    protected int protectedField = 300;

    protected void protectedMethod() {
        System.out.println("Protected Method Called");
    }
}


public class AccessProtected {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
    }
}

(b) Access in Subclass from Another Package
File: mypackage/ProtectedSubClass.java (Different Package)


package mypackage;
import ProtectedClass;

public class ProtectedSubClass extends ProtectedClass {
    public static void main(String[] args) {
        ProtectedSubClass obj = new ProtectedSubClass();
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
    }
}




(c) Access in a Non-Subclass from Another Package
File: mypackage/NonSubClass.java

package mypackage;
import ProtectedClass;

public class NonSubClass {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        // System.out.println(obj.protectedField); // ERROR: Not accessible
        // obj.protectedMethod(); // ERROR: Not accessible
    }
}

