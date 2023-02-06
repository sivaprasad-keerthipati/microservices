package com.microservice.item.database.service;

import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.sdk.model.ToDoItemCollection;

public interface DatabaseService {

	Boolean addItem(final ToDoItem toDoItem);

	ToDoItem getItem(final int itemNo);

	ToDoItemCollection getItems();

	Boolean updateItem(int itemNo, final ToDoItem toDoItem);

	Boolean deleteItem(final int itemNo);
}
