
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers should be printed?");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            // Draw and print a random number
            Random randomNumber = new Random();
            System.out.println(randomNumber.nextInt(11));
        }

    }

}
