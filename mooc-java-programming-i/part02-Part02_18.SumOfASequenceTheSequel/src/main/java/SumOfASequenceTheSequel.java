
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fist number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = first; i <= last; i++) {

            sum += i;

        }
        System.out.println("The sum is " + sum);

    }
}
