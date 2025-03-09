import java.io.FileReader;
import java.io.IOException;

class ReadUsingFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
