import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input your value:");
        int value = new Scanner(System.in).nextInt();
        int factorial = 1;
        for (int i = 1; i <= value; i = i + 1) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of input value = " + factorial);
    }
}