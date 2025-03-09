import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class WriteUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("BufferedWriter example in Java.");
        bw.close();
    }
}
