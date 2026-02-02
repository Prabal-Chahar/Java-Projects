
import java.util.Random;
import java.util.Scanner;

public class Traffic_Signal {

    public static void main(String[] args) {

        System.out.println("Welcome to My Traffic Signal Program");
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter No of Roads");
            int roadno = sc.nextInt();
            int[] roadid = new int[roadno];
            int vechiles[] = new int[roadno];
            int wait[] = new int[roadno];
            int priority[] = new int[roadno];
            int[] list = new int[roadno];
            Boolean swap;
            while (true) {
                System.out.println("Enter Your Chioce\n1.Choose Manually\n2.Enter Random");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        for (int i = 0; i < roadno; i++) {
                            roadid[i] = i;
                            System.out.println("Enter Wait");
                            wait[i] = sc.nextInt();
                            System.out.println("Enter Vehicle No");
                            vechiles[i] = sc.nextInt();
                            System.out.println("Enter Prority");
                            priority[i] = sc.nextInt();
                            list[i] = roadid[i];
                        }
                        for (int j = 0; j < roadid.length - 1; j++) {
                            swap = false;
                            if (priority[j] < priority[j + 1]) {
                                swap = true;
                            } else if (priority[j] == priority[j + 1] && vechiles[j] < vechiles[j + 1]) {
                                swap = true;
                            } else if (priority[j] == priority[j + 1] && vechiles[j] == vechiles[j + 1] && wait[j] < wait[j + 1]) {
                                swap = true;
                            }
                            if (swap) {
                                int temp = list[j];
                                list[j] = list[j + 1];
                                list[j + 1] = temp;
                            }
                        }
                        System.out.println("Road ID");
                        for (int l = 0; l < list.length; l++) {
                            System.out.print(roadid[l] + " ");
                        }
                        System.out.println("\n");
                        System.out.println("Order");
                        for (int m = 0; m < list.length; m++) {
                            System.out.print(list[m] + " ");
                        }
                        System.out.println("\n");
                    }
                    case 2 -> {
                        for (int i = 0; i < roadno; i++) {
                            roadid[i] = i;
                            wait[i] = rand.nextInt(120);
                            vechiles[i] = rand.nextInt(50);
                            priority[i] = rand.nextInt(roadno);
                            list[i] = roadid[i];
                        }
                        for (int j = 0; j < roadid.length - 1; j++) {
                            swap = false;
                            if (priority[j] < priority[j + 1]) {
                                swap = true;
                            } else if (priority[j] == priority[j + 1] && vechiles[j] < vechiles[j + 1]) {
                                swap = true;
                            } else if (priority[j] == priority[j + 1] && vechiles[j] == vechiles[j + 1] && wait[j] < wait[j + 1]) {
                                swap = true;
                            }
                            if (swap) {
                                int temp = list[j];
                                list[j] = list[j + 1];
                                list[j + 1] = temp;
                            }
                        }
                        System.out.println("Road ID");
                        for (int l = 0; l < list.length; l++) {
                            System.out.print(roadid[l] + " ");
                        }
                        System.out.println("\n");
                        System.out.println("Order");
                        for (int m = 0; m < list.length; m++) {
                            System.out.print(list[m] + " ");
                        }
                        System.out.println("\n");
                    }
                    default -> {
                        System.out.println("No Function.Program Terminated.");
                        return;
                    }
                }
            }
        }
    }
}
