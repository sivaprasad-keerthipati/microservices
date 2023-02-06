package com.microservice.item.sdk.client;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

public class RestTemplate extends org.springframework.web.client.RestTemplate
{

	@Override
	public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType) throws RestClientException
	{
		return super.exchange(url, method, requestEntity, responseType);
	}
}
