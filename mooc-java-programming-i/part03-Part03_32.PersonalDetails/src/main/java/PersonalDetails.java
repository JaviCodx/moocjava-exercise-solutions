
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longest = "";
                

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            if (name.length() > longest.length()) {
                longest = parts[0];
            }
            count++;
            sum += Integer.valueOf(parts[1]);

        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (float)sum/count);

    }
}
