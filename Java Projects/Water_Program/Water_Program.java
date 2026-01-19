
import java.util.Random;
import java.util.Scanner;

public class Water_Program {

    public static void main(String[] args) {

        System.out.println("Welcome to My Program");
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int[] water = new int[12];
            int[] problems = new int[3];
            System.out.println("How you want to enter Water Levels");
            System.out.println("1.Random\n2.Choice");
            int choice = sc.nextInt();
            int check;
            switch (choice) {
                case 1 -> {
                    for (int i = 0; i < 12; i++) {
                        water[i] = rand.nextInt(901) + 100;
                    }
                    System.out.println("Do you want to check water levels");
                    check = sc.nextInt();
                    if (check == 1) {
                        int warning = 0;
                        int warning1 = 0;
                        for (int i = 1; i < 11; i++) {
                            if (water[i] - water[i - 1] > 200) {
                                problems[0] = 1;
                            } else if (water[i] == water[i + 1]) {
                                warning1++;
                                if (warning1 == 4) {
                                    problems[2] = 3;
                                }
                            }
                        }
                        for (int i = 0; i < 11; i++) {
                            if (water[i] > water[i + 1]) {
                                warning++;
                                if (warning == 3) {
                                    problems[1] = 2;
                                }
                            }

                        }
                        System.out.println("Water Levels");
                        for (int j = 0; j < 12; j++) {
                            System.out.print(water[j] + " ");
                        }
                        System.out.println("\n");

                    } else {
                        System.out.println("Your Choice");
                        return;
                    }

                }
                case 2 -> {
                    for (int i = 0; i < 12; i++) {
                        System.out.println("Enter Water Level : ");
                        water[i] = sc.nextInt();
                    }
                    check = sc.nextInt();
                    if (check == 1) {
                        int warning = 0;
                        int warning1 = 0;
                        for (int i = 1; i < 11; i++) {
                            if (water[i] - water[i - 1] > 200) {
                                problems[0] = 1;
                            } else if (water[i] > water[i + 1]) {
                                warning++;
                                if (warning == 3) {
                                    problems[1] = 2;
                                }
                            } else if (water[i] == water[i + 1]) {
                                warning1++;
                                if (warning1 == 4) {
                                    problems[2] = 3;
                                }
                            }
                        }
                    } else {
                        System.out.println("Your Choice");
                        return;
                    }
                    System.out.println("Water Levels");
                    for (int i = 0; i < 12; i++) {
                        System.out.print(water[i] + " ");
                    }
                    System.out.println("\n");
                }
                default -> {
                    System.out.println("Thank You");
                    break;
                }
            }
            if (problems[0] == 1) {
                System.out.println("Leak Suspison");
            }
            if (problems[1] == 2) {
                System.out.println("Critical Usuge");
            }
            if (problems[2] == 3) {
                System.out.println("Pump Failure");
            }
            if (problems[0] != 1 && problems[1] != 2 && problems[2] != 3) {
                System.out.println("Stable");
            }
        }
    }
}
