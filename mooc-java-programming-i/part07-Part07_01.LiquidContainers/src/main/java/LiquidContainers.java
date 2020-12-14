
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.print("First: " + container1 + "/100 \n");
            System.out.print("Second: " + container2 + "/100 \n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (parts[0].equals("add")) {
                if (amount > 0) {
                    container1 += amount;
                    if (container1 > 100) {
                        container1 = 100;
                    }
                }
            } else if (parts[0].equals("move")) {

                if (amount > 0) {

                    if (amount > container1) {
                        int tmp = container1;
                        container1 = 0;
                        container2 = tmp;
                    } else {
                        container1 -= amount;
                        container2 += amount;
                    }
                    
                    if (container2 > 100)
                    {
                        container2= 100;
                    }

                }
            } else if (parts[0].equals("remove")) {
                container2 -= amount;
                if (container2 < 0) {
                    container2 = 0;
                }

            }

            System.out.println();

        }

    }
}
