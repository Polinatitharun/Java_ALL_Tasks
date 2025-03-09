import java.util.Scanner;

public class Main {
    // Static variable (Global variable)
    int number = 10;

    public static void main(String[] args) {
        // Local variable
        int number;
        System.out.println("enter value for local variable");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        System.out.println("Local variable: " + number);
        System.out.println("Global variable: " + number); 
        
        sc.close();
    }
}