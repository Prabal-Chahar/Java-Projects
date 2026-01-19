
import java.util.Scanner;

public class Password_Strength_Checker {

    public static void main(String[] args) {

        System.out.println("Welcome to My Password Strength Checker");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("What are requirements\n1.Default\n2.Choose");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter Password");
                        String password = sc.next();
                        int check = 0;
                        int alphabet = 0;
                        int number = 0;
                        int schar = 0;
                        for (int i = 0; i < password.length(); i++) {
                            char ch = password.charAt(i);
                            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                                alphabet++;
                            } else if (ch >= '0' && ch <= '9') {
                                number++;
                            } else {
                                schar++;
                            }
                        }

                        if (alphabet >= 8) {
                            check++;
                        }
                        if (number >= 2) {
                            check++;
                        }
                        if (schar >= 2) {
                            check++;
                        }

                        switch (check) {
                            case 1 -> {
                                System.out.println("Unsecure");
                                System.out.println("Your Password : " + password + '\n');
                            }
                            case 2 -> {
                                System.out.println("Good But Little Unsecure");
                                System.out.println("Your Password : " + password + '\n');
                            }
                            case 3 -> {
                                System.out.println("Excellant");
                                System.out.println("Your Password : " + password + '\n');
                            }
                            default -> {
                                System.out.println("Very Unsecure");
                                System.out.println("Your Password : " + password + '\n');
                            }
                        }

                        System.out.println("Required Alphabet : 8");
                        System.out.println("Number : 2");
                        System.out.println("Special Character : 2");
                        System.out.println("Check : " + check);
                        System.out.println("Alphabet : " + alphabet);
                        System.out.println("Number : " + number);
                        System.out.println("Special Character : " + schar + "\n");

                    }
                    case 2 -> {
                        System.out.println("Enter Your Requirement");
                        System.out.println("Enter No of Alphabet");
                        int check1 = sc.nextInt();
                        System.out.println("Enter No of Number");
                        int check2 = sc.nextInt();
                        System.out.println("Enter No of Special Character");
                        int check3 = sc.nextInt();
                        System.out.println("Enter Password");
                        String password = sc.next();
                        int check = 0;
                        int alphabet = 0;
                        int number = 0;
                        int schar = 0;
                        for (int i = 0; i < password.length(); i++) {
                            char ch = password.charAt(i);
                            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                                alphabet++;
                            } else if (ch >= '0' && ch <= '9') {
                                number++;
                            } else {
                                schar++;
                            }
                        }
                        if (alphabet >= check1) {
                            check++;
                            if (number >= check2) {
                                check++;
                                if (schar >= check3) {
                                    check++;
                                }
                            }

                            switch (check) {
                                case 1 -> {
                                    System.out.println("Unsecure");
                                    System.out.println("Your Password : " + password + '\n');
                                }
                                case 2 -> {
                                    System.out.println("Good But Little Unsecure");
                                    System.out.println("Your Password : " + password + '\n');
                                }
                                case 3 -> {
                                    System.out.println("Excellant");
                                    System.out.println("Your Password : " + password + '\n');
                                }
                                default -> {
                                    System.out.println("Very Unsecure");
                                    System.out.println("Your Password : " + password + '\n');
                                }
                            }
                            System.out.println("Required Alphabet : " + check1);
                            System.out.println("Required Number : " + check2);
                            System.out.println("Required Special Character : " + check3);
                            System.out.println("Check : " + check);
                            System.out.println("Alphabet : " + alphabet);
                            System.out.println("Number : " + number);
                            System.out.println("Special Character : " + schar + "\n");

                        }
                    }
                    default -> {
                        break;
                    }
                }
            }
        }
    }
}
