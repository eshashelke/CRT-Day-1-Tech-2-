import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, pos, value;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position: ");
        pos = sc.nextInt();

        System.out.print("Enter value: ");
        value = sc.nextInt();

        for(int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = value;

        System.out.println("Array after insertion:");

        for(int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
