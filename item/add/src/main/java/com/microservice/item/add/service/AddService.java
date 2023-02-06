package com.microservice.item.add.service;

import com.microservice.item.sdk.model.ToDoItem;

public interface AddService {

	Boolean addItem(ToDoItem toDoItem);

}
