package com.revature.caliber.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.revature.caliber.model.SimpleCategory;
import com.revature.caliber.repository.CategoryRepository;

@Service
public class CategoryRepositoryMessagingService {

	@Autowired
	private CategoryRepositoryRequestDispatcher categoryRepositoryRequestDispatcher;
	
	@RabbitListener(queues = "revature.caliber.repos.category")
	public SimpleCategory receiveSingleSimpleCategoryRequest(String message) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		
		return categoryRepositoryRequestDispatcher.processSingleSimpleCategoryRequest(request);
	}

	@RabbitListener(queues = "revature.caliber.repos.category.list")
	public List<SimpleCategory> receiveListSimpleCategoryRequest(String message) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		
		return categoryRepositoryRequestDispatcher.processListSimpleCategoryRequest(request);
	}
}
