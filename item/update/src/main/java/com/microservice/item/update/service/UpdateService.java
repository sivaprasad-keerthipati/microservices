package com.microservice.item.update.service;

import com.microservice.item.sdk.model.ToDoItem;

public interface UpdateService {

	Boolean updateItem(int itemNo, ToDoItem toDoItem);

}
