import java.util.Scanner;

class MultipleCatches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int arr[] = new int[5];
            arr[10] = 30 / sc.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred.");
        }
    }
}
