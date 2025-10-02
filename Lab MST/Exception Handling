import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers (type 'done' to Exit): ");

        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }

        try {
            int sum = 0;
            for (int num : list) sum += num;
            double avg = sum / list.size();
            System.out.println("Average: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: List is empty, cannot calculate average.");
        }
    }
}
