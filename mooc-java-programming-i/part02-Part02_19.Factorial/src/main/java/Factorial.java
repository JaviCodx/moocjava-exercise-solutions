
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int last = Integer.valueOf(scanner.nextLine());
        
        int fact = 1;

        for (int i = 1; i <= last; i++) {

            fact *= i;

        }
        System.out.println("Factorial:" + fact);

    }
}
