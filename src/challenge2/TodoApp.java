package challenge2;

import util.Input;

public class TodoApp {
    public static void main(String[] args) {
        TodoItemManager itemList = new TodoItemManager();
        Input in = new Input();
        boolean quit = false;

        do {
            System.out.println("Select the function number you would like to perform.");
            System.out.printf("" +
                    "1. Add a task%n" +
                    "2. Remove a task%n" +
                    "3. Show list%n" +
                    "4. Close program%n" +
                    "> ");
            int userSelection = in.getInt();
            switch (userSelection) {
                case 1 -> itemList.addItem();
                case 2 -> itemList.removeItem();
                case 3 -> itemList.printList();
                case 4 -> quit = true;
            }
        } while (!quit);
        System.out.println("Ok bye!");
    }
}