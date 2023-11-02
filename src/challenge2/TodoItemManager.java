package challenge2;

import util.Input;

import java.util.ArrayList;

public class TodoItemManager {
    private ArrayList<TodoItem> todoList;
    private Input in = new Input();

    public TodoItemManager() {
        this.todoList = new ArrayList<>();
    }

    public void addItem() {
        System.out.print("Enter a new task: ");
        String newTask = in.getLine();
        TodoItem newItem = new TodoItem(newTask);
        todoList.add(newItem);
    }

    public void removeItem() {
        printList();
        System.out.print("Enter the task number you wish to delete: ");

        /*this takes what the user enters, subtracts 1 (to get the index number) and then passes that value to the remove method on the ArrayList. Finally, it spits out what the task was that was annihilated.*/
        int index = in.getInt();
        if (index > 0 && index <= todoList.size()) {
            TodoItem removedItem = todoList.remove(index - 1);
            System.out.printf("Removed: %s%n", removedItem.getItemDesc());
        } else {
            System.out.println("You don't have a task with that corresponding number, pal.");
        }
    }

    public void printList() {
        int count = 0;
        System.out.println("Todo List:");
        for (TodoItem item : todoList) {
            count += 1;
            System.out.printf("%s. %s%n", count, item.getItemDesc());
        }
    }
}