import java.util.Scanner;

public class Even_Print{
   public static void main(String[] args) {

        System.out.println("Welcome to My Program");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a");
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                if (i%2==0) {
                    System.out.print(i+" ");
                    
                }
            }
        }
    }
}