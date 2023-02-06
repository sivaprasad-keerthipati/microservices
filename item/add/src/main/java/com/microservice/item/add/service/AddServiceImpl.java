package com.microservice.item.add.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.item.sdk.client.ItemSdkClient;
import com.microservice.item.sdk.model.ToDoItem;


@Service
public class AddServiceImpl implements AddService
{
	@Autowired
	private ItemSdkClient itemSdkClient;

	@Override
	public Boolean addItem(final ToDoItem toDoItem)
	{
		return itemSdkClient.postResource(toDoItem);
	}
}
