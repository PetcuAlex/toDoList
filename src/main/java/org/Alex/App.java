package org.Alex;

import org.Alex.persistence.ToDoItemRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
//        toDoItemRepository.createToDoItem("Learn Dancing", LocalDateTime.now().plusMonths(14));

//        toDoItemRepository.deleteToDoItem(4);
        toDoItemRepository.updateToDoItem(3,true);

        System.out.println(toDoItemRepository.getToDoItems());
    }
}
