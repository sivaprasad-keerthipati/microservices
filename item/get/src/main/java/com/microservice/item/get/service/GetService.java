package com.microservice.item.get.service;

import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.sdk.model.ToDoItemCollection;

public interface GetService {

	ToDoItem getItem(int itemNo);

	ToDoItemCollection getItems();

}
