
import java.util.Random;
import java.util.Scanner;

public class Exam_Hall {

    public static void main(String[] args) {
        System.out.println("Welcome to My Exam Hall Program");
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            String cCode = "CodeC";
            int violation = 0;
            int sNum = rand.nextInt(20 - 5 + 1) + 5;
            int[] student = new int[sNum];
            System.out.println("Enter Supervisor Code : ");
            String eCode = sc.next();
            for (int i = 0; i < sNum; i++) {
                student[i] = rand.nextInt(2);
            }
            if (eCode.equals(cCode)) {
                for (int k = 0; k < student.length - 1; k++) {
                    if (student[k] == student[k + 1] && student[k] == 1) {
                        violation++;
                    }
                }
            } else if (!eCode.equals(cCode)) {
                System.out.println("Wrong Code");
                return;
                
            }
            
            for (int j = 0; j < sNum; j++) {
                System.out.print(student[j] + " ");
            }
            System.out.println("Violation : " + violation);
        }
    }
}
