
import java.util.*;

public class Binary_Calculator {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Welcome To My Binary Calculator Program");
                System.out.println("Which Type Of Calculation You Want\n1.Deimal to Binary\n2.Binary to Binary\n3.Exit");
                String change = sc.next();
                switch (change) {
                    case "Decimal" -> {
                        System.out.println("Enter Decimal Number : ");
                        int n1 = sc.nextInt();
                        System.out.println("Enter Decimal Number : ");
                        int n2 = sc.nextInt();

                        System.out.println("Available Operations : \n1.Add\n2.Sub\n3.Mul\n4.Divide");
                        System.out.println("Enter Operation");
                        String choice = sc.next();
                        switch (choice) {
                            case "Add" -> {
                                int Sum = n1 + n2;
                                String result = Integer.toBinaryString(Sum);
                                System.out.println("Binary Sum : " + result);
                                System.out.println("Decimal Sum : " + Sum);
                            }
                            case "Sub" -> {
                                int Sub = n1 - n2;
                                String result = Integer.toBinaryString(Sub);
                                System.out.println("Binary Sub : " + result);
                                System.out.println("Decimal Sum : " + Sub);
                            }
                            case "Mul" -> {
                                int Mul = n1 * n2;
                                String result = Integer.toBinaryString(Mul);
                                System.out.println("Binary Mul : " + result);
                                System.out.println("Decimal Mul : " + Mul);
                            }
                            case "Div" -> {
                                if(n2!=0){
                                int Div = n1 / n2;
                                String result = Integer.toBinaryString(Div);
                                System.out.println("Binary Div : " + result);
                                System.out.println("Decimal Div : " + Div);}
                                else{
                                    System.out.println("Divison Not Possible");
                                }
                            }
                            default -> {
                                System.out.println("Function Not Available");
                                break;
                            }
                        }
                    }
                    case "Binary" -> {
                        int n1;
                        int n2;
                        System.out.println("Enter Binary Number : ");
                        String b1 = sc.next();
                        System.out.println("Enter Binary Number : ");
                        String b2 = sc.next();
                        for (int i = 0; i < b1.length(); i++) {
                            if (b1.charAt(i) != '0' || b1.charAt(i) != '1') {
                                System.out.println("Number 1 is not binary");
                                break;
                            }

                        }
                        n1 = Integer.parseInt(b1, 2);
                        for (int j = 0; j < b2.length(); j++) {
                            if (b2.charAt(j) != '0' || b2.charAt(j) != '1') {
                                System.out.println("Number 2 is not binary");
                                break;
                            }
                        }
                        n2 = Integer.parseInt(b2, 2);
                        System.out.println("Available Operations : \n1.Add\n2.Sub\n3.Mul\n4.Divide");
                        System.out.println("Enter Operation");
                        String choice = sc.next();
                        switch (choice) {
                            case "Add" -> {
                                int Sum = n1 + n2;
                                String result = Integer.toBinaryString(Sum);
                                System.out.println("Sum : " + result);
                            }
                            case "Sub" -> {
                                int Sub = n1 - n2;
                                String result = Integer.toBinaryString(Sub);
                                System.out.println("Sub : " + result);
                            }
                            case "Mul" -> {
                                int Mul = n1 * n2;
                                String result = Integer.toBinaryString(Mul);
                                System.out.println("Mul : " + result);
                            }
                            case "Div" -> {
                                if(n2!=0){
                                int Div = n1 / n2;
                                String result = Integer.toBinaryString(Div);
                                System.out.println("Div : " + result);}
                                else{
                                    System.out.println("Divison Not Posible");
                                }
                            }
                            default -> {
                                System.out.println("Function Not Available");
                                break;
                            }
                        }
                    }
                    default -> {
                        System.out.println("Thank You");
                        return;
                    }
                }

            }
        }
    }
}
