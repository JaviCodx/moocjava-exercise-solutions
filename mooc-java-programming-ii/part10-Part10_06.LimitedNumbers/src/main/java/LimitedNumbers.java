
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> inputs = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }

            inputs.add(input);

        }
        
        inputs.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));

    }
}
