package com.microservice.item.add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.item.add.service.AddService;
import com.microservice.item.sdk.model.ToDoItem;

@CrossOrigin
@Controller
@RequestMapping("/rest/add")
public class AddController
{
	@Autowired
	private AddService addService;

	@RequestMapping(method = RequestMethod.POST, value="/item")
	public @ResponseBody Boolean addItem(@RequestBody ToDoItem toDoItem)
	{
		return addService.addItem(toDoItem);
	}
}
