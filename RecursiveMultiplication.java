import java.util.Scanner;

public class RecursiveMultiplication {

    static int multiply(int a, int b) {

        if(b == 0)
            return 0;

        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("Multiplication is: " + multiply(a, b));
    }
}
