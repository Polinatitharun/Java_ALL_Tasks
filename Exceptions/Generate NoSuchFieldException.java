import java.lang.reflect.*;

class NoSuchFieldExample {
    public int data;

    public static void main(String[] args) throws NoSuchFieldException {
        NoSuchFieldExample obj = new NoSuchFieldExample();
        Field field = obj.getClass().getDeclaredField("unknownField");
    }
}
