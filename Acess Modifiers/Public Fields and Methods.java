//File: PublicClass.java
public class PublicClass {
    public int publicField = 400;

    public void publicMethod() {
        System.out.println("Public Method Called");
    }
}

//File: AccessPublic.java
public class AccessPublic {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}

//(b) Access from Another Package
//File: mypackage/PublicAccess.java


package mypackage;
import PublicClass;

public class PublicAccess {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}
