import java.lang.Math;
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            System.out.println((int)Math.pow(Integer.parseInt(input), 3));
        }
    }
}