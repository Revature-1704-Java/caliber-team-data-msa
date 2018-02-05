package com.revature.caliber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.JsonObject;
import com.revature.caliber.model.SimpleCategory;
import com.revature.caliber.repository.CategoryRepository;

public class CategoryRepositoryRequestDispatcher {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public SimpleCategory processSingleSimpleCategoryRequest(JsonObject request) {
		SimpleCategory result = null;
		String methodName = request.get("methodName").getAsString();
		
		if(methodName.equals("findOne")) {
			int categoryId = request.get("categoryId").getAsInt();
			result = categoryRepository.findOne(categoryId);
		}
		
		return result;
	}
	
	public List<SimpleCategory> processListSimpleCategoryRequest(JsonObject request) {
		List<SimpleCategory> result = null;
		String methodName = request.get("methodName").getAsString();
		
		if(methodName.equals("findAll")) {
			result = categoryRepository.findAll();
		}
		
		return result;
	}
}