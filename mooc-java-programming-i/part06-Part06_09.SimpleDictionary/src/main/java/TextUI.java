/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = scan.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.print("Translation: ");
                String translation = scan.nextLine();

                this.dictionary.add(word, translation);
                continue;

            }

            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String translated = scan.nextLine();

                if (dictionary.translate(translated) == null) {
                    System.out.println("Word " + translated + " was not found");
                    continue;
                }

                System.out.println(dictionary.translate(translated));
                continue;
            }

            System.out.println("Unknown command");

        }
    }

}
