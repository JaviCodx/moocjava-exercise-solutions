
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Where to? ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int from= Integer.valueOf(scanner.nextLine());
        
        

        for (int i = from; i <= number; i++) {
            System.out.println(i);
        }
    }
}
