import java.util.Scanner;  

public class DataTypesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

       
        System.out.print("Enter an integer: ");
        int myInt = sc.nextInt(); 

        System.out.print("Enter a boolean (true/false): ");
        boolean myBool = sc.nextBoolean();

        System.out.print("Enter a character: ");
        char myChar = sc.next().charAt(0); 
        System.out.print("Enter a float value: ");
        float myFloat = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double myDouble = sc.nextDouble();

        // Printing values
        System.out.println("\nYou Entered:");
        System.out.println("Integer: " + myInt);
        System.out.println("Boolean: " + myBool);
        System.out.println("Character: " + myChar);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        sc.close(); 
}
