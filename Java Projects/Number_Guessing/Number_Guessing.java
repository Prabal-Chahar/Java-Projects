
import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            System.out.println("Welcome to My Number Guessing Game");
            int Guess = rand.nextInt(100);
            int count = 0;
            while (true) {
                System.out.println("Enter A Number");
                int Entered = sc.nextInt();
                if (Entered == Guess) {
                    System.out.println("You Win");
                    System.out.println("In " + count + " Guesses");
                    if (count <4) {
                        System.out.println("Very Good");
                    } else if (count <8 ) {
                        System.out.println("Very Good");
                    } else if (count < 10) {
                        System.out.println("Fine");
                    } else if (count < 12) {
                        System.out.println("Need Improvement");
                    } else {
                        System.out.println("Nothing To Say");
                    }
                    return;
                } else if (Entered != Guess && (Guess - Entered > 0)) {
                    System.out.println("Guess High\n");
                    count++;
                } else if (Entered != Guess && (Guess - Entered < 0)) {
                    System.out.println("Guess Low\n");
                    count++;
                } else {
                    System.out.println("Not Possible");
                }

            }
        }
    }
}
