package com.microservice.item.get.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.item.sdk.client.ItemSdkClient;
import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.sdk.model.ToDoItemCollection;


@Service
public class GetServiceImpl implements GetService
{
	@Autowired
	private ItemSdkClient itemSdkClient;

	@Override
	public ToDoItem getItem(final int itemNo)
	{
		return itemSdkClient.getResource(itemNo);
	}

	@Override
	public ToDoItemCollection getItems()
	{
		return itemSdkClient.getResources();
	}
}
