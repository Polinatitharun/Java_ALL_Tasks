import java.io.*;

class FileNotFoundExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("non_existent_file.txt");
    }
}
