import java.io.FileWriter;
import java.io.IOException;

class WriteUsingFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("FileWriter example in Java.");
        fw.close();
    }
}
