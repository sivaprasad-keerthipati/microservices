package com.microservice.item.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.item.delete.service.DeleteService;

@CrossOrigin
@Controller
@RequestMapping("/rest/delete/item/")
public class DeleteController {

	@Autowired
	private DeleteService deleteService;

	@RequestMapping(method = RequestMethod.DELETE, value="{id}")
	public @ResponseBody Boolean deleteResource(@PathVariable(value = "id") int itemNo)
	{
		return deleteService.deleteItem(itemNo);
	}
}
