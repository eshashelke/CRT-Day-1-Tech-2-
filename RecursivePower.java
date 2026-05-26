import java.util.Scanner;

public class RecursivePower {

    static int power(int a, int b) {

        if(b == 0)
            return 1;

        return a * power(a, b - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter base number: ");
        a = sc.nextInt();

        System.out.print("Enter power: ");
        b = sc.nextInt();

        System.out.println("Answer is: " + power(a, b));
    }
}
