import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class WriteUsingBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
        String data = "Buffered output stream example.";
        bos.write(data.getBytes());
        bos.close();
    }
}
