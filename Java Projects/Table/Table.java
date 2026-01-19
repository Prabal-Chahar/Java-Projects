import java.util.Scanner;

public class Table{
   public static void main(String[] args) {

        System.out.println("Welcome to My Program");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a");
            int a = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " X " + i + " = " + (a*i));
            }
        }
    }
}