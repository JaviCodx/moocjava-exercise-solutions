/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scan;
    private TodoList todo;

    public UserInterface(TodoList todo, Scanner scan) {
        this.scan = scan;
        this.todo = todo;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();
            switch (command) {
                case "add":
                    System.out.print("To add: ");
                    String thingToDo = scan.nextLine();
                    todo.add(thingToDo);
                    break;
                case "list":
                    todo.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int toDoThingIndex = Integer.parseInt(scan.nextLine());
                    todo.remove(toDoThingIndex);
                    break;
                case "stop":
                    break;
            }

            if (command.equals("stop")) {
                break;
            }
        }
    }
}
