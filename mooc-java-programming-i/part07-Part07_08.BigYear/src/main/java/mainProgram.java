
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birdList = new ArrayList<>();

        while (true) {
            System.out.print("?");

            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();

                birdList.add(new Bird(name, nameLatin));

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                for (Bird bird : birdList) {
                    bird.addObervation(name);
                    
                }

            } else if (command.equals("All")) {
                for (Bird bird : birdList) {
                    System.out.println(bird.getName() + " (" + bird.getLatinName() + ") " + bird.getObervations() + " observations");
                }

            } else if (command.equals("One")) {
                System.out.print("Bird: ");
                String name = scan.nextLine();
                for (Bird bird : birdList) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird.getName() + " (" + bird.getLatinName() + ") " + bird.getObervations() + " observations");
                        
                    }
                    
                }
            }

        }

    }
}
