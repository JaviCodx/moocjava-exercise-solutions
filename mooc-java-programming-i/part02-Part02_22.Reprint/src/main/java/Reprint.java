
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            printText();
        }
    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");

    }
}
