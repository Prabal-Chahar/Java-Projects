import java.util.Scanner;

public class Secure_Login {

    public static void main(String[] args) {

        System.out.println("Welcome to My Program");
        try (Scanner sc = new Scanner(System.in)) {
            String userName = "User1234";
            String user;
            String pass;
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter UserName");
                user = sc.next();
                System.out.println("Enter Password");
                pass = sc.next();
                if (user.equals(userName)) {
                    int check = 0;
                    int alphabet = 0;
                    int number = 0;
                    int schar = 0;
                    for (int j = 0; j < pass.length(); j++) {
                        char ch = pass.charAt(j);
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
                            System.out.println("Your Password : " + pass + '\n');
                        }
                        case 2 -> {
                            System.out.println("Good But Little Unsecure");
                            System.out.println("Your Password : " + pass + '\n');
                        }
                        case 3 -> {
                            System.out.println("Excellant");
                            System.out.println("Your Password : " + pass + '\n');
                        }
                        default -> {
                            System.out.println("Very Unsecure");
                            System.out.println("Your Password : " + pass + '\n');
                        }
                    }

                    if (check >= 2 && i <= 2) {
                        System.out.println("Login Successful");
                        System.out.println("Required Alphabet : 8");
                        System.out.println("Number : 2");
                        System.out.println("Special Character : 2");
                        System.out.println("Check : " + check);
                        System.out.println("Alphabet : " + alphabet);
                        System.out.println("Number : " + number);
                        System.out.println("Special Character : " + schar + "\n");
                    } else {
                        System.out.println("Login Failed");
                        System.out.println("Password Not Strong");
                        System.out.println("Attempt Remaining : " + (2 - i) + "\n");
                    }

                }
            }
        }
    }
}