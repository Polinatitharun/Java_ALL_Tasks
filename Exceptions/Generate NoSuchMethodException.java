import java.lang.reflect.*;

class NoSuchMethodExample {
    public void show() {}

    public static void main(String[] args) throws NoSuchMethodException {
        NoSuchMethodExample obj = new NoSuchMethodExample();
        Method method = obj.getClass().getDeclaredMethod("unknownMethod");
    }
}
