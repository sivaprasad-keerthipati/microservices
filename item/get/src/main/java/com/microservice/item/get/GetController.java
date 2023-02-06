package com.microservice.item.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.item.get.service.GetService;
import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.sdk.model.ToDoItemCollection;

@CrossOrigin
@Controller
@RequestMapping("/rest/get/item/")
public class GetController {

	@Autowired
	private GetService getService;

	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public @ResponseBody ToDoItem getResource(@PathVariable(value = "id") int itemNo)
	{
		return getService.getItem(itemNo);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody ToDoItemCollection getResources()
	{
		return getService.getItems();
	}
}
