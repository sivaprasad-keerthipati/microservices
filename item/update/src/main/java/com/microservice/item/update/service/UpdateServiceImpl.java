package com.microservice.item.update.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.item.sdk.client.ItemSdkClient;
import com.microservice.item.sdk.model.ToDoItem;

@Service
public class UpdateServiceImpl implements UpdateService
{
	@Autowired
	private ItemSdkClient itemSdkClient;

	@Override
	public Boolean updateItem(final int itemNo, final ToDoItem toDoItem)
	{
		return itemSdkClient.putResource(itemNo, toDoItem);
	}
}
