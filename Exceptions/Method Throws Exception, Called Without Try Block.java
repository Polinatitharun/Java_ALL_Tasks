class ExceptionMethod {
    static void throwException() throws ArithmeticException {
        throw new ArithmeticException("Generated Exception");
    }

    public static void main(String[] args) {
        throwException();
    }
}
