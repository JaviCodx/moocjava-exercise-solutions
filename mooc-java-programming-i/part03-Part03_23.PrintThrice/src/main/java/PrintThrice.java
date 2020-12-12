
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String cake = scanner.nextLine();
        
        System.out.println(cake+cake+cake);

    }
}
