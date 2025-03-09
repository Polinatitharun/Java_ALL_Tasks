import java.util.Scanner;

public class PrintClass {
    
    static void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name to print:");
        
        String name = sc.nextLine();
        printName(name); 
        
        sc.close(); 
    }
}
