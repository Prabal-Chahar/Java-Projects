
import java.util.Scanner;

public class Encr_Decr {

    public static void main(String[] args) {

        int key = 0;
        String newText = "";
        while (true) {
            System.out.println("Welcome to My Encryptor Dercryptor Program");
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("What do you want to do");
                System.out.println("1.Encrypt\n2.Decrypt\n3.Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter Text");
                        String text = sc.next();
                        System.out.println("Create Key");
                        key = sc.nextInt();
                        for (int i = 0; i < text.length(); i++) {
                            char ch = text.charAt(i);
                            if (ch >= 'A' && ch <= 'Z') {
                                ch = (char) (ch + 1);
                                newText += ch;
                            } else if (ch >= 'a' && ch <= 'z') {
                                ch = (char) (ch - 1);
                                newText += ch;
                            } else if (ch >= '0' && ch <= '9') {
                                ch = (char) (ch * 3);
                                newText += ch;
                            } else {
                                ch = (char) (ch * 2);
                                newText += ch;
                            }
                        }
                        System.out.println(key);
                        System.out.println(newText);
                    }
                    case 2 -> {
                        System.out.println("Enter Text");
                        String text1 = sc.next();
                        System.out.println("Enter Key");
                        int key1 = sc.nextInt();
                        String decText = "";
                        if (key1 == key) {
                            for (int i = 0; i < text1.length(); i++) {
                                char ch = text1.charAt(i);
                                if (ch >= 'A' && ch <= 'Z') {
                                    ch = (char) (ch - 1);
                                    decText += ch;
                                } else if (ch >= 'a' && ch <= 'z') {
                                    ch = (char) (ch + 1);
                                    decText += ch;
                                } else if (ch >= '0' && ch <= '9') {
                                    ch = (char) (ch / 3);
                                    text1 += ch;
                                } else {
                                    ch = (char) (ch / 2);
                                    decText += ch;
                                }
                            }
                            System.out.println(decText);
                            newText = "";
                        } else {
                            System.out.println("Wrong Key");
                        }
                    }
                    case 3 -> {
                        System.out.println("Thank You");
                        break;
                    }
                    default ->
                        System.out.println("Wrong Key");
                }
            }
        }

    }
}