package com.microservice.item.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.item.database.service.DatabaseService;
import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.sdk.model.ToDoItemCollection;

@Controller
@RequestMapping("/rest/database/item/")
public class DatabaseController {

	@Autowired
	private DatabaseService databaseService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Boolean postResource(@RequestBody ToDoItem toDoItem)
	{
		return databaseService.addItem(toDoItem);
	}

	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public @ResponseBody ToDoItem getResource(@PathVariable(value = "id") int itemNo)
	{
		return databaseService.getItem(itemNo);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody ToDoItemCollection getResources()
	{
		return databaseService.getItems();
	}

	@RequestMapping(method = RequestMethod.PUT, value="{id}")
	public @ResponseBody Boolean putResource(@PathVariable(value = "id") int itemNo, @RequestBody ToDoItem toDoItem)
	{
		return databaseService.updateItem(itemNo, toDoItem);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="{id}")
	public @ResponseBody Boolean deleteResource(@PathVariable(value = "id") int itemNo)
	{
		return databaseService.deleteItem(itemNo);
	}
}