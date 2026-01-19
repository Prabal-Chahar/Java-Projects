
import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to My Parking Program");
            System.out.println("Which is your vehicle\n1.Bike\n2.Car\n3.Truck");
            int vehicle = sc.nextInt();
            System.out.println("Enter Entry Time(0-23)");
            int entry = sc.nextInt();
            System.out.println("Enter Exit Time(0-23)");
            int exit = sc.nextInt();
            int totalTime;
            int charge = 0;
            if (exit >= entry && entry <= 23 && exit <= 23) {
                totalTime = exit - entry;
            } else {
                totalTime = (24 - entry) + exit;
            }

            switch (vehicle) {
                case 1 -> {
                    if (totalTime <= 2) {
                        charge = (totalTime * 10) + 20;
                    } else if (totalTime > 2 && totalTime <= 10) {
                        charge = (totalTime * 20) + 10;
                    } else {
                        charge = (totalTime * 20) + 20;
                    }
                }
                case 2 -> {
                    if (totalTime <= 2) {
                        charge = (totalTime * 40) + 20;
                    } else if (totalTime > 2 && totalTime <= 10) {
                        charge = (totalTime * 20) + 10;
                    } else {
                        charge = (totalTime * 50) + 20;
                    }
                }
                case 3 -> {
                    if (totalTime <= 2) {
                        charge = (totalTime * 60) + 20;
                    } else if (totalTime > 2 && totalTime <= 10) {
                        charge = (totalTime * 20) + 10;
                    } else {
                        charge = (totalTime * 80) + 20;
                    }
                }
                default -> {
                    System.out.println("Not Valid Vehicle");
                }
            }
            System.out.println("Vehicle Type : \n1.Bike\n2.Car\n3.Truck\"Vehcile No : " + vehicle);
            System.out.println("Entry Ticket : 20");
            System.out.println("Charges : " + (charge + 10));
            System.out.println("Entry : " + entry);
            System.out.println("Exit : " + exit);
            System.out.println("Total Time : " + totalTime);
            System.out.println("Discount : 10");
            System.out.println("Final : " + charge);
        }
    }
}
