
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int count = 0;
        int wins = 0;

        try ( Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                int home = Integer.valueOf(parts[2]);
                int visitor = Integer.valueOf(parts[3]);
                if (parts[0].equals(team) || parts[1].equals(team)) {
                    count++;
                    if (parts[0].equals(team) && home < visitor) {
                        wins++;
                    } else if (parts[1].equals(team) && visitor > home){
                        wins++;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (count - wins));

    }

}
