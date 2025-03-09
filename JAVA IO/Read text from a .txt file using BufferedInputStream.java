import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class ReadUsingBufferedInputStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
        int ch;
        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }
        bis.close();
    }
}
