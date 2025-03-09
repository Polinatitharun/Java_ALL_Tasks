import java.io.FileOutputStream;
import java.io.IOException;

class WriteUsingOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        String data = "Hello, this is a test file.";
        fos.write(data.getBytes());
        fos.close();
    }
}
