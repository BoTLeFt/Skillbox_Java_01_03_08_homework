import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input your value:");
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i = i + 1) {
            if (value % i == 0) {
                System.out.println(i+"*"+value/i);
            }
        }
    }
}