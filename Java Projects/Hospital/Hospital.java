
import java.util.Random;
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        System.out.println("Welcome to My Hospital Program");
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int[] id = new int[10];
            int[] age = new int[10];
            int[] condition = new int[10];
            int[] list = new int[10];
            while (true) {
                System.out.println("Enter Your Choice\n1.Enter Value\n2.Random\nAny Other To Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        for (int i = 0; i < 10; i++) {
                            id[i] = i;
                            System.out.println("Enter Age of Patient");
                            age[i] = sc.nextInt();
                            System.out.println("Enter Condition of patient");
                            condition[i] = sc.nextInt();
                        }
                        for (int j = 0; j < 10; j++) {
                            list[j] = j;
                        }
                        for (int j = 0; j < 9; j++) {
                            for (int k = 0; k < 9 - j; k++) {
                                boolean swap = false;
                                if (condition[list[k]] < condition[list[k + 1]]) {
                                    swap = true;
                                } else if (condition[list[k]] == condition[list[k + 1]] && age[list[k]] < age[list[k + 1]]) {
                                    swap = true;
                                } else if (condition[list[k]] == condition[list[k + 1]] && age[list[k]] == age[list[k + 1]] && list[k] > list[k + 1]) {
                                    swap = true;
                                }
                                if (swap) {
                                    int temp = list[k];
                                    list[k] = list[k + 1];
                                    list[k + 1] = temp;
                                }
                            }
                        }
                        for (int k = 0; k < 10; k++) {
                            System.out.print(id[k]);
                        }
                        System.out.println("\n");
                        for (int l = 0; l < 10; l++) {
                            System.out.print(list[l] + " ");
                        }
                    }
                    case 2 -> {
                        for (int i = 0; i < 10; i++) {
                            id[i] = i;
                            age[i] = rand.nextInt(100);
                            condition[i] = rand.nextInt(5) + 1;
                        }
                        for (int j = 0; j < 10; j++) {
                            list[j] = j;
                        }
                        for (int j = 0; j < 9; j++) {
                            for (int k = 0; k < 9 - j; k++) {
                                boolean swap = false;
                                if (condition[list[k]] < condition[list[k + 1]]) {
                                    swap = true;
                                } else if (condition[list[k]] == condition[list[k + 1]] && age[list[k]] < age[list[k + 1]]) {
                                    swap = true;
                                } else if (condition[list[k]] == condition[list[k + 1]] && age[list[k]] == age[list[k + 1]] && list[k] > list[k + 1]) {
                                    swap = true;
                                }
                                if (swap) {
                                    int temp = list[k];
                                    list[k] = list[k + 1];
                                    list[k + 1] = temp;
                                }
                            }
                        }
                        for (int k = 0; k < 10; k++) {
                            System.out.print(id[k]);
                        }
                        System.out.println("\n");
                        for (int l = 0; l < 10; l++) {
                            System.out.print(list[l] + " ");
                        }
                    }
                    default -> {
                        System.out.println("Not Function");
                        return;
                    }
                }
            }
        }
    }
}
