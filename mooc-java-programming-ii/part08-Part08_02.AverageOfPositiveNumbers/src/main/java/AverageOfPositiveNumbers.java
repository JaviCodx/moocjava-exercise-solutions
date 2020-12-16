
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum += input;
                amount++;
            }
        }
        if (sum > 0) {
            System.out.println(sum / (amount * 1.0));
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
