
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
        Grades points = new Grades();
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        UserInterface ui = new UserInterface(scanner, points);
        ui.start();
       
    }
}
