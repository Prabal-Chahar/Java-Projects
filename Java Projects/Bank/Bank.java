
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to My BankProgram");
            try (Scanner sc = new Scanner(System.in)) {
                int balance = 0;
                System.out.println("Enter what you want to do");
                System.out.println("1.Deposit\n2.Withdraw\n");
                System.out.println("Your Choice");
                int a = sc.nextInt();
                switch (a) {
                    case 1 -> {
                        System.out.println("Enter Amount");
                        int b = sc.nextInt();
                        if (b > 0 && b < 10000) {
                            System.out.println("Deposit Done");
                            balance = balance + b;
                            System.out.println("Balance " + balance+"\n");
                        } else {
                            System.out.println("Visit Bank for Trasfer Deposit Above 10000");
                        }
                    }

                    case 2 -> {
                        System.out.println("Enter Amount");
                        int c = sc.nextInt();
                        if (c > balance ||  balance < 0) {
                            System.out.println("Fund Not Enough\n");
                        } 
                        else if (c > 0 && c < 10000) {
                            System.out.println("Withdraw Done");
                            balance = balance - c;
                            System.out.println("Balance " + balance+"\n");

                        } 
                        else {
                            System.out.println("Visit Bank for Trasfer Withdraw Above 10000");
                        }
                    }

                    case 3 -> {
                        System.out.println("Thank You");
                        break;
                    }

                    default ->{
                        System.out.println("Not Valid\n");
                        break;
                    }
                }
            }
        }
    }
}
