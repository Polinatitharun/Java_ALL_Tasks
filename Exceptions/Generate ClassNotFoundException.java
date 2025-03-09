class ClassNotFoundExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("UnknownClass");
    }
}
