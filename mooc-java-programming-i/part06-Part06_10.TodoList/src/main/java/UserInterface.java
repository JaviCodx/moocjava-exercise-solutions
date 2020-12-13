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

public class UserInterface {

    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.todoList = todoList;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scan.nextLine();

                this.todoList.add(toAdd);
                continue;
            }

            if (command.equals("list")) {
                this.todoList.print();
                continue;
            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scan.nextLine());
                this.todoList.remove(toRemove);

            }

        }

    }

}
