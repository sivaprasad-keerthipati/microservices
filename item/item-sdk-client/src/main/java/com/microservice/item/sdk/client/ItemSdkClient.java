package com.microservice.item.sdk.client;

import java.net.URI;

import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.microservice.item.sdk.model.ToDoItem;
import com.microservice.item.sdk.model.ToDoItemCollection;

@Lazy
@Component
public class ItemSdkClient {
	private static final String HOTNAME = "http://localhost:1111";
	private static final String DATABASE_SERVICE_ROOT_URI = "/rest/database/item/";
	private static final URI FULL_URI = URI.create(HOTNAME + DATABASE_SERVICE_ROOT_URI);

	public Boolean postResource(final ToDoItem toDoItem)
	{
		HttpEntity<ToDoItem> httpEntity = new HttpEntity<>(toDoItem, null);
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.exchange(FULL_URI, HttpMethod.POST, httpEntity, Boolean.class).getBody();
	}

	public ToDoItem getResource(int itemNo)
	{
		HttpEntity<Integer> httpEntity = new HttpEntity<>(null, null);
		RestTemplate restTemplate = new RestTemplate();
		URI FULL_URI = URI.create(HOTNAME + DATABASE_SERVICE_ROOT_URI + itemNo);
		return restTemplate.exchange(FULL_URI, HttpMethod.GET, httpEntity, ToDoItem.class).getBody();
	}

	public ToDoItemCollection getResources()
	{
		HttpEntity<Integer> httpEntity = new HttpEntity<>(null, null);
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.exchange(FULL_URI, HttpMethod.GET, httpEntity, ToDoItemCollection.class).getBody();
	}

	public Boolean putResource(final int itemNo, final ToDoItem toDoItem)
	{
		HttpEntity<ToDoItem> httpEntity = new HttpEntity<>(toDoItem, null);
		RestTemplate restTemplate = new RestTemplate();
		URI FULL_URI = URI.create(HOTNAME + DATABASE_SERVICE_ROOT_URI + itemNo);
		return restTemplate.exchange(FULL_URI, HttpMethod.PUT, httpEntity, Boolean.class).getBody();
	}

	public Boolean deleteResource(int itemNo)
	{
		HttpEntity<Integer> httpEntity = new HttpEntity<>(null, null);
		RestTemplate restTemplate = new RestTemplate();
		URI FULL_URI = URI.create(HOTNAME + DATABASE_SERVICE_ROOT_URI + itemNo);
		return restTemplate.exchange(FULL_URI, HttpMethod.DELETE, httpEntity, Boolean.class).getBody();
	}

}
