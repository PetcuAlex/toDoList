package org.Alex.service;

import org.Alex.domain.ToDoItem;
import org.Alex.persistence.ToDoItemRepository;
import org.Alex.transfer.SaveToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {

    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    public void createToDoItem(SaveToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating toDoItem:" + request);
        //delegating db interactions to repository(single-responsibility principle)
        toDoItemRepository.createToDoItem(request.getDescription(),request.getDeadline());

    }

    public List<ToDoItem> getToDoItems() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Retriving toDoItems...");
        return toDoItemRepository.getToDoItems();
    }

    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting toDoItem:" + id);
        toDoItemRepository.deleteToDoItem(id);
    }
}
