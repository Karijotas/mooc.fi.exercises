
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mantas
 */
public class TodoList {

    private List<String> todoList = new ArrayList<>();

    public TodoList() {
    }

    public void add(String task) {
        todoList.add(task);
    }

    public void print() {
        int i = 1;
        for (String element : todoList) {
            System.out.println(i + ": " + element);
            ++i;
        }
    }

    public void remove(int index) {
        todoList.remove(index - 1);
    }

}
