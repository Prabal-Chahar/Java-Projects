
import java.util.*;

public class Library {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {

                System.out.println("Welcome to My Program");
                Random rand = new Random();
                System.out.println("How You To Enter Students\n1.Random\n2.Custom");
                String choice = sc.next();
                switch (choice) {
                    case "Random" -> {
                        int count = 0;
                        int[] random = new int[12];
                        int[] urgent1 = new int[12];
                        int[] normal1 = new int[12];
                        int[] Final1 = new int[12];
                        int totalTime1 = 0;
                        for (int i = 0; i < 12; i++) {
                            random[i] = rand.nextInt(40) - 20;
                            if (random[i] < 0) {
                                urgent1[i] = -1 * (random[i]);
                                Final1[i] = 1 * (random[i]);
                                totalTime1 += urgent1[i];
                                count++;
                            } else {
                                normal1[i] = random[i];
                                Final1[i] = random[i];
                                count++;
                            }
                        }
                        for (int j = 0; j < 10; j++) {
                            totalTime1 += normal1[j];
                        }
                        System.out.println("Final Order");
                        for (int k = 0; k < count; k++) {
                            System.out.print(Final1[k] + " ");
                        }
                        System.out.println("\n\nTotal Time : " + totalTime1);
                        if (totalTime1 > 120) {
                            System.out.println("Overload\n");
                        } else {
                            System.out.println("Normal Load\n");
                        }
                    }
                    case "Custom" -> {
                        int[] custom = new int[12];
                        int[] urgent = new int[12];
                        int[] normal = new int[12];
                        int[] Final = new int[12];
                        int count1 = 0;
                        int totalTime = 0;
                        for (int i = 0; i < 12; i++) {
                            System.out.println("Enter Int " + i + " : ");
                            custom[i] = sc.nextInt();
                            if (custom[i] < 0) {
                                urgent[i] = -1 * (custom[i]);
                                Final[i] = 1 * (custom[i]);
                                totalTime += urgent[i];
                                count1++;
                            } else {
                                normal[i] = custom[i];
                                Final[i] = custom[i];
                                count1++;
                            }
                        }
                        for (int j = 0; j < 12; j++) {
                            totalTime += normal[j];
                        }
                        System.out.println("Final Order");
                        for (int k = 0; k < count1; k++) {
                            System.out.print(Final[k] + " ");
                        }
                        System.out.println("\n\nTotal Time : " + totalTime);
                        if (totalTime > 120) {
                            System.out.println("Overload\n");
                        } else {
                            System.out.println("Normal Load\n");
                        }

                    }
                    default -> {
                        System.out.println("Option Not Available");
                        return;
                    }
                }
            }
        }

    }

}
