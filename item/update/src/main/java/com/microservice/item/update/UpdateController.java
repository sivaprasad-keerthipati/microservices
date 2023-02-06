package com.microservice.item.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.update.service.UpdateService;

@CrossOrigin
@Controller
@RequestMapping("/rest/update/item/")
public class UpdateController
{
	@Autowired
	private UpdateService updateService;

	@RequestMapping(method = RequestMethod.PUT, value="{id}")
	public @ResponseBody Boolean addItem(@PathVariable(value = "id") int itemNo, @RequestBody ToDoItem toDoItem)
	{
		return updateService.updateItem(itemNo, toDoItem);
	}
}
