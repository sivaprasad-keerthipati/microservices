package com.microservice.item.database.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.sdk.model.ToDoItemCollection;

@Service
public class DatabaseServiceImpl implements DatabaseService
{
	Map<Integer, ToDoItem> map = new HashMap<>();

	@Override
	public Boolean addItem(ToDoItem toDoItem)
	{
		if (!map.keySet().contains(toDoItem.getItemNo()))
		{
			map.put(toDoItem.getItemNo(), toDoItem);
			return true;
		}
		return false;
	}

	@Override
	public ToDoItem getItem(final int itemNo)
	{
		return map.get(itemNo);
	}

	@Override
	public ToDoItemCollection getItems() {
		ToDoItemCollection toDoItemCollection = new ToDoItemCollection();
		toDoItemCollection.setItems(map.values());
		return toDoItemCollection;
	}

	@Override
	public Boolean updateItem(int itemNo, ToDoItem toDoItem)
	{
		if (map.keySet().contains(itemNo))
		{
			map.put(itemNo, toDoItem);
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteItem(final int itemNo)
	{
		if (map.keySet().contains(itemNo))
		{
			map.remove(itemNo);
			return true;
		}
		return false;
	}
}
