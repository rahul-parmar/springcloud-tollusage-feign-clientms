package com.example.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.model.TollUsage;
import com.example.repository.TollUsageFeignMSRepo;

@RestController
public class TollServiceClient {
	
	@Autowired
	TollUsageFeignMSRepo feignRepo;
	
	
	
	@RequestMapping(value="/client")
	public List<TollUsage> findAll(){
	return feignRepo.findAll();
	
	
	}
	
	@RequestMapping(value="/client/{id}")
	public TollUsage getById(@PathVariable("id")String id){
	return feignRepo.findById(id);
	
	
	}
	
	
	

}
