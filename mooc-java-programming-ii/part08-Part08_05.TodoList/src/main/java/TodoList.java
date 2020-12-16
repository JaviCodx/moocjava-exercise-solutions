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
import java.util.List;

public class TodoList {

    private List<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        todoList.add(task);
    }

    public void print() {
        for (String string : todoList) {
            System.out.println((todoList.indexOf(string) + 1) + ": " + string);
        }
    }

    public void remove(int number) {
        todoList.remove(todoList.get(number - 1));

    }
}
