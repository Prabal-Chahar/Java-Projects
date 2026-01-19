
import java.util.Scanner;

public class Integer_Collection {

    public static void main(String[] args) {

        System.out.println("Welcome to My Integer Collection Program");
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[50];
            int positive = 0;
            int negative = 0;
            int Sum = 0;
            int i = 0;
            while (Sum <= 120 && i < arr.length) {
                System.out.print("Enter " + i + " Element :");
                arr[i] = sc.nextInt();
                if (Sum + arr[i] > 120) {
                    break;
                } else if (Sum + arr[i] <= 120) {
                    if (arr[i] > 0) {
                        positive++;
                    } else {
                        negative++;
                    }
                    Sum += arr[i];
                    i++;
                }

            }
            int largest = arr[0];
            int smallest = arr[0];
            for (int k = 1; k < i; k++) {
                if (arr[k] > largest) {
                    largest = arr[k];
                } else if (arr[k] < smallest) {
                    smallest = arr[k];
                }
            }
            System.out.println("Array");
            int j = 0;
            while (j < i) {
                System.out.print(arr[j] + " ");
                j++;
            }
            System.out.println("\nSum " + Sum);
            System.out.println("Largest Number " + largest);
            System.out.println("Smallest Number " + smallest);
            System.out.println("Positive Number " + positive);
            System.out.println("Negative Number " + negative);
        }

    }
}
