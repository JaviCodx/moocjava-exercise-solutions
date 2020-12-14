
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.print("First: " + container1 +"\n");
            System.out.print("Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            int amount = Integer.valueOf(parts[1]);

            if (parts[0].equals("add")) {
                container1.add(amount);
            } else if (parts[0].equals("move")) {

                if (amount > 0) {

                    if (amount > container1.contains()) {
                        int tmp = container1.contains();
                        container1.setContains(0);
                        container2.setContains(tmp);
                    } else {
                        container1.remove(amount);
                        container2.add(amount);
                    }

                    if (container2.contains() > 100) {
                        container2.setContains(100);
                    }

                }
            } else if (parts[0].equals("remove")) {
                container2.remove(amount);

            }

            System.out.println();

        }

    }

}
