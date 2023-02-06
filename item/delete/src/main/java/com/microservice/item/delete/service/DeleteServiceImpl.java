package com.microservice.item.delete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.item.sdk.client.ItemSdkClient;

@Service
public class DeleteServiceImpl implements DeleteService
{
	@Autowired
	private ItemSdkClient itemSdkClient;

	@Override
	public Boolean deleteItem(final int itemNo)
	{
		return itemSdkClient.deleteResource(itemNo);
	}
}
